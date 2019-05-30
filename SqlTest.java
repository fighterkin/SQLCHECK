public class SqlTest {
   public void sqlInsert() {
      String value = httpGet();
      String b = value;
      String c = securieyKey(b);
      String excutSQL = "select * from user where username =" + c;
      runSql(excutSql);
   }
}
