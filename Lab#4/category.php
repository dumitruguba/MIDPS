<?php
	$players_sql="SELECT players.playerID, players.name, players.value, category.name AS catname FROM players JOIN category ON players.categoryID=category.categoryID WHERE players.categoryID=".$_GET['categoryID'];
	if($players_query=mysqli_query($dbconnect, $players_sql)){
		$players_rs=mysqli_fetch_assoc($players_query);
	}
	if(!mysqli_num_rows($players_query)==0){
		?>
		<h3><font color="#003d99"><span><?php echo $players_rs['catname'];?></span></font></h3>
		<?php 
		do{
			?>
			<div class="item">
			<a href="index.php?page=player&playerID=<?php echo $players_rs['playerID']; ?>"><p><font color="#003d99"><?php echo $players_rs['name']; ?></font></p></a>
			</div>
		<?php
		}while($players_rs=mysqli_fetch_assoc($players_query));
		?>
		<?php
	}
?>

<?php
	$position_sql="SELECT position.positionID, position.name, category.name AS catname FROM position JOIN category ON position.categoryID=category.categoryID WHERE position.categoryID=".$_GET['categoryID'];
	if($position_query=mysqli_query($dbconnect, $position_sql)){
		$position_rs=mysqli_fetch_assoc($position_query);
	}
	if(!mysqli_num_rows($position_query)==0){
		?>
		<h3><font color="#003d99"><span><?php echo $position_rs['catname'];?></span></font></h3>
		<?php 
		do{
			?>
			<div class="news">
			<a href="index.php?page=news&positionID=<?php echo $position_rs['positionID']; ?>"><p><font color="#003d99"><?php echo $position_rs['name']; ?></font></p></a>
			</div>
		<?php
		}while($position_rs=mysqli_fetch_assoc($position_query));
		?>
		<?php
	}
?>

<?php
	$trophies_sql="SELECT trophies.trophiesID, trophies.descriere, category.name AS catname FROM trophies JOIN category ON trophies.categoryID=category.categoryID WHERE trophies.categoryID=".$_GET['categoryID'];
	if($trophies_query=mysqli_query($dbconnect, $trophies_sql)){
		$trophies_rs=mysqli_fetch_assoc($trophies_query);
	}
	if(!mysqli_num_rows($trophies_query)==0){
		?>
		<h3><font color="#003d99"><span><?php echo $trophies_rs['catname'];?></span></font></h3>
		<?php 
		do{
			?>
			<div class="trophy">
			<p><font color="#1a1a1a"><?php echo $trophies_rs['descriere']; ?></font></p>
			</div>
		<?php
		}while($trophies_rs=mysqli_fetch_assoc($trophies_query));
		?>
		<?php
	}
?>

<?php
	$about_sql="SELECT about.aboutID, about.descriere, category.name AS catname FROM about JOIN category ON about.categoryID=category.categoryID WHERE about.categoryID=".$_GET['categoryID'];
	if($about_query=mysqli_query($dbconnect, $about_sql)){
		$about_rs=mysqli_fetch_assoc($about_query);
	}
	if(!mysqli_num_rows($about_query)==0){
		?>
		<h3><font color="#003d99"><span><?php echo $about_rs['catname'];?></span></font></h3>
		<?php 
		do{
			?>
			<div class="trophy">
			<p><font color="#1a1a1a"><?php echo $about_rs['descriere']; ?></font></p>
			</div>
		<?php
		}while($about_rs=mysqli_fetch_assoc($about_query));
		?>
		<?php
	}
?>