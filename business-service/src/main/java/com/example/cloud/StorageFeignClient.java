package com.example.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description：
 *
 * @author fangliangsheng
 * @date 2019-04-04
 */
@FeignClient(name ="storage-service", url = "127.0.0.1:8081")
public interface StorageFeignClient {

    @GetMapping("/deduct")
    void deduct(@RequestParam String commodityCode,@RequestParam Integer count);

}
