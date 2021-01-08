package com.traceJP.setu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private final int number = Integer.parseInt(Util.getProperties("imgNumber"));

    private void start() {

        ExecutorService service = Executors.newFixedThreadPool(
                Integer.parseInt(
                        Util.getProperties("threadNumber")
                )
        );

        for (int i = 0; i < number; i++) {
            RequestSetu test =  new RequestSetu();
            Model model = Util.getJsonBean(test.requestSetu());
            if(model.getCode() == 0) {
                System.out.println("请求接口成功 ----> 即将开始下载 " + model.getData()[0].getTitle());
                service.execute(
                        new DownLoad(
                                model.getData()[0].getUrl(),
                                model.getData()[0].getTitle()
                        )
                );
            } else if(model.getCode() == 429) {
                System.out.println("请求接口失败 ----> 今日调用额度已受限！");
            } else {
                System.out.println("请求接口失败 ----> 出现未知错误！");
            }

        }
        service.shutdown();
    }

    public static void main(String[] args) {
        new Main().start();
    }

}
