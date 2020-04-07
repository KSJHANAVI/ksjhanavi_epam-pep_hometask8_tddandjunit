public class DeleteAA {

public String delete(String s) {
// TODO Auto-generated method stub
char c[]=s.toCharArray();
String rev="";
if(s.length()==1)
{
if(s.charAt(0)!='A')
rev=rev+s.charAt(0);

}
else
{
if(s.charAt(0)!='A')
rev=rev+s.charAt(0);
if(s.charAt(1)!='A')
rev=rev+s.charAt(1);
for(int i=2;i<s.length();i++)
rev=rev+s.charAt(i);

}
return rev;
}

}
