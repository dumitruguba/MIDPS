<?php
	include("dbconnect.php");
?>

<html>

	<head>
		<title>Real Madrid CF</title>
		<link rel="stylesheet" href="main.css" type="text/css" />
	</head>
	
	<body>
		<div class="container">
			<?php
				include("header.php");
			if(!isset($_GET['page'])){
				?><img style="position: absolute; top:90px; left:0px; width:1365px; height:399px;" src="images/real.jpg" alt="real">
			<?php
			}
				include("champions.php");
				if(isset($_GET['page'])){
			?>
				<?php
				}
				include("champions.php");
				?>
			<div class="maincontent">
				<?php
					if(isset($_GET['page'])){
						$page=$_GET['page'];
						include("$page.php");
					}
				?>
			</div>
		</div>
	</body>
	
</html>