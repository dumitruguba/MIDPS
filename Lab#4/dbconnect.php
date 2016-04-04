<?php
	$dbconnect = mysqli_connect("localhost", "root", "", "l4_site");
	if(mysqli_connect_error()){
		echo "Connection failed:".mysqli_connect_error();
		exit;
	}
?>