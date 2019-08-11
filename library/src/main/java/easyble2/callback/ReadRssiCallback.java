package easyble2.callback;

import androidx.annotation.NonNull;
import easyble2.Request;

/**
 * date: 2019/8/3 17:44
 * author: zengfansheng
 */
public interface ReadRssiCallback extends RequestFailedCallback {
    /**
     * 读取到设备的信号强度
     *
     * @param request 请求
     * @param rssi    信号强度
     */
    void onRssiRead(@NonNull Request request, int rssi);
}
