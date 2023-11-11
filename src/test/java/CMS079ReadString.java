import wz.WzFile;
import wz.WzObject;
import wz.WzProperty;
import wz.common.WzVersion;

/**
 * author deedy
 * description 测试用 读取cms简体中文字符串
 * date 2023/11/11 18:42
 */
public class CMS079ReadString {

    public static void main(String[] args) {
        WzFile wzFile = new WzFile("E:\\WZ\\cms079\\String.wz", (short) 79, WzVersion.EMS);
        WzObject<?, ?> mapImg = wzFile.getChild("Map.img");
        WzObject<?, ?> chinese = mapImg.getChild("chinese");
        WzObject<?, ?> property = chinese.getChild("700000000");
        WzProperty child = (WzProperty) property.getChild("mapName");
        String str = child.getValue().toString(); // 红鸾宫入口
        System.out.println(str);
    }

}
