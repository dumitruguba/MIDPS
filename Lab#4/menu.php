<?php
	$cat_sql="SELECT * FROM category";
	$cat_query=mysqli_query($dbconnect, $cat_sql);
	$cat_rs=mysqli_fetch_assoc($cat_query);
	
	$a=0;
	do{ $a++;?>
	<a href="index.php?page=category&categoryID=<?php echo $cat_rs['categoryID']; ?>"><font color="#003d99"><?php echo $cat_rs['name']; ?></font></a>
	<font color="#003d99"><?php if($a!=4) echo"| ";?></font>
	<?php
	}while($cat_rs=mysqli_fetch_assoc($cat_query))
?>