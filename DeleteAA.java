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


class DeleteAATest {
DeleteAA d;
@BeforeEach
void setUp()
{
d=new DeleteAA();
}
@Test
void test1char() {

assertEquals("BCD",d.delete("ABCD"));

}
@Test
void test2chars()
{
assertEquals("CD",d.delete("AACD"));


}
@Test
void testchar() {
assertEquals("BCD",d.delete("BACD"));

}
@Test
void testzchar() {

assertEquals("BBAA",d.delete("BBAA"));

}
@Test
void testtchar() {
assertEquals("BAA",d.delete("AABAA"));

}
}