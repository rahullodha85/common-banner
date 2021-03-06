param([string]$worksp, [string]$selectedServers)

$svc
$exception=false

foreach($Server in $selectedServers.Split(","))
{
    echo $Server
    $uncServer="\\" + $Server
    $username="AutomationUser"
    $password="Automation123"

    $svc = Get-Service -Name "Automation Framework" -ComputerName $Server
    $destination = "\\" + $Server+ "\e$\HBCD_Automation\"
    $source=$worksp + "\target\"
    
    if($svc.Status -eq "Running")
    {
        echo "Stopping Automation Framework service"
        Stop-Service -InputObject $svc
        echo $svc.Status
        echo "Service Stopped"
    }

    echo "Copying Jar files"
    $sourcefiles = get-childitem $source -file -Recurse -filter *.jar

    net use $uncServer $password /USER:$username
    try
    {
        foreach($file in $sourcefiles)
        {
            echo $file.Name
            Copy-Item -Path $file.FullName -Destination $destination
        }
    }
    catch [Exception]
    {
        $exception=true
        echo $_.Exception.GetType().FullName, $_.Exception.Message
        echo "Error copying jar files"
        net use $uncServer /delete
    }
    finally
    {
        echo "Starting Automation Framework service"
        Start-Service -InputObject $svc
        echo $svc.Status
        if($exception)
        {
            exit 1
        } 
    }

    echo "Copying resource files"
    $source=$worksp + "\target\classes\"
    $sourcefiles = get-childitem $source -file -Recurse -include *.xlsx

    net use $uncServer $password /USER:$username
    try
    {
        foreach($file in $sourcefiles)
        {
            echo $file.Name
            Copy-Item -Path $file.FullName -Destination $destination
        }
    }
    catch [Exception]
    {
        $exception=true
        echo $_.Exception.GetType().FullName, $_.Exception.Message
        echo "Error copying jar files"
        net use $uncServer /delete
    }
    finally
    {
        echo "Starting Automation Framework service"
        Start-Service -InputObject $svc
        echo $svc.Status
        if($exception)
        {
            exit 1
        } 
    }
}
