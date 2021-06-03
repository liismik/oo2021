<?php

    require("../../config.php");
    $database = "if20_liisa_mi_1";

    $conn = new mysqli($serverhost, $serverusername, $serverpassword, $database);
    $stmt = $conn->prepare("SELECT appl_name, app_url, url_change, app_platform, app_actual_address, app_tech_contact, app_in_server, app_version, app_client, app_comment FROM app_info");

    echo $conn->error;
    $stmt->bind_result($namefromdb, $urlfromdb, $changetimefromdb, $platformfromdb, $addressfromdb, $contactfromdb, $serverfromdb, $versionfromdb, $clientfromdb, $commentfromdb);
    $stmt->execute();
    $apphtml = "\t <ol> \n "; //
    while($stmt->fetch()){
        $apphtml .= "<ul>" .$namefromdb ." \n";
        $apphtml .= "<ul> \n";
        $apphtml .= "<ul>URL: " .$urlfromdb ."</ul> \n";
        $apphtml .= "<ul>URLi muudeti viimati: " .$changetimefromdb ."</ul> \n";
        $apphtml .= "<ul>Platvorm: " .$platformfromdb ."</ul> \n";
        $apphtml .= "<ul>Serveri tegelik aadress: " .$addressfromdb ."</ul> \n";
        $apphtml .= "<ul>Tehniline kontakt: " .$contactfromdb ."</ul> \n";
        $apphtml .= "<ul>Asukoht serveris: " .$serverfromdb ."</ul> \n";
        $apphtml .= "<ul>Rakenduse versioon: " .$versionfromdb ."</ul> \n";
        $apphtml .= "<ul>Tellija: " .$clientfromdb ."</ul> \n";
        $apphtml .= "<ul>Kommentaar: " .$commentfromdb ."</ul> \n";
        $apphtml .= "</ul> \n";
        $apphtml .= "</ul> \n";
    }
    $apphtml .= "\t </ol> \n";
    
    $stmt->close();
    $conn->close();
?>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="app_info.css">
<body>
    <br>
    <div id="logoimage">
        <image src="logotest.png" alt="logo" height="100px" width="320px">
    </div>
    <br>
    <div id="container"> 
        <div id="container_one"></div>
        <div id="container_two">
            <div id="content">
            <h2><?php echo $namefromdb?></h2>
            <?php echo $apphtml; ?>
            <ul><button><a href="change_app_info.php">Muuda andmeid</a></button></ul>
            </div>
        </div>
    </div>
</body>