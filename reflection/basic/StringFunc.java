package reflection.basic;

import LoggerLib.Logger;
import reflection.BaseCase;

public class StringFunc extends BaseCase {
    public void test() {
        String testStr = "test_str";
//        String concat = testStr.concat("_concat");
        String concat = testStr + "_concat";
        Logger.reportString(concat, "StringFunc_concat");
        String replaceFirst = testStr.replaceFirst("t", "r");
        Logger.reportString(replaceFirst, "StringFunc_replaceFirst");
        String replaceAll = testStr.replaceAll("t", "r");
        Logger.reportString(replaceAll, "StringFunc_replaceAll");
        String toLower = testStr.toLowerCase();
        Logger.reportString(toLower, "StringFunc_toLowerCase");
        String toUpper = testStr.toUpperCase();
        Logger.reportString(toUpper, "StringFunc_toUpperCase");
        String subString = testStr.substring(0, 2);
        Logger.reportString(subString, "StringFunc_substring");
    }
}
