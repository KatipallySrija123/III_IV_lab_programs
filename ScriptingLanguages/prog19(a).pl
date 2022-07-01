$string = "Welcome to bvritH";
$sub = "bvritH";
$ind = index($string,$sub);
$replstr = "BVRITH";
substr($string,$ind,length($sub)) = $replstr;
print $string;
