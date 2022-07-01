print "Enter Ip address:";
$ip = <stdin>;
if ($ip =~ /^(\d{1,3}.\d{1,3}.\d{1,3}.\d{1,3}.\d{1,3})$/) {
print "valid IP\n";
}else {
print "invalid IP\n";
}
print "Enter E-mail:";
$Email = <stdin>;
if($Email =~ /^[\w]+[{.}\w]*@[\w]+.\w{2,3}$/){
print "valid"
}else {
print "invalid";
}
