package easyble2.callback;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import easyble2.Device;

/**
 * date: 2019/8/3 17:44
 * author: zengfansheng
 */
public interface PhyUpdateCallback extends RequestFailedCallback {
    /**
     * @param tag    请求标识
     * @param device 设备
     */
    void onPhyUpdate(@Nullable String tag, @NonNull Device device, int txPhy, int rxPhy);
}