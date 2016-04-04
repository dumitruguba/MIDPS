<?php
	$news_sql="SELECT * FROM position WHERE positionID=".$_GET['positionID'];
	if($news_query=mysqli_query($dbconnect, $news_sql)) {
		$news_rs=mysqli_fetch_assoc($news_query);
		?>
		<div class="description">
			<h3><?php echo $news_rs['name']; ?></h3>
			<p><?php echo $news_rs['descriere']; ?></p>
		</div>
		<?php
	}
?>