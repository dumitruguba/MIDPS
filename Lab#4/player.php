<?php
	$player_sql="SELECT * FROM players WHERE playerID=".$_GET['playerID'];
	if($player_query=mysqli_query($dbconnect, $player_sql)) {
		$player_rs=mysqli_fetch_assoc($player_query);
		?>
		<div class="description">
			<h3><?php echo $player_rs['name']; ?></h3>
			<p>Value: <?php echo $player_rs['value']; ?></p>
			<p><?php echo $player_rs['description']; ?></p>
		</div>
		<?php
	}
?>