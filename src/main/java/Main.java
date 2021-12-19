import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String originalText = "sdflh qeriue ,vmb dhsdnv rirn kdkf qq aa dfds zxcc l; " +
                "m,dmf werwqy aadasd [re[r dvcsd svs d cxvsd fnsldn xcvknxc oetiu sdjfs[ [p[rpeo";

        List <String> glossary = Arrays.stream(originalText.split(" ")).sorted().collect(Collectors.toList());

    }
}
