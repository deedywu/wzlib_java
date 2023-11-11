import wz.WzFile;
import wz.WzObject;
import wz.WzProperty;
import wz.common.WzVersion;

/**
 * author deedy
 * description 测试用 读取tms繁体中文字符串
 * date 2023/11/11 18:40
 */
public class TMS113ReadString {

    public static void main(String[] args) {
        WzFile wzFile = new WzFile("E:\\WZ\\tms065\\String.wz", 65, WzVersion.BMS);
        WzObject<?, ?> mapImg = wzFile.getChild("Map.img");
        WzObject<?, ?> chinese = mapImg.getChild("chinese");
        WzObject<?, ?> property = chinese.getChild("700000000");
        WzProperty child = (WzProperty) property.getChild("mapName");
        String str = child.getValue().toString(); // 紅鸞宮入口
        System.out.println(str);
    }

}
