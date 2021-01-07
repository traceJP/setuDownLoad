package com.traceJP.setu;

public class Main {

    private final int number = Integer.parseInt(Util.getProperties("imgNumber"));

    private void run() {
        for (int i = 0; i < number; i++) {
            RequestSetu test =  new RequestSetu();
            Model model = Util.getJsonBean(test.requestSetu());
            System.out.println(model);
            DownLoad downLoad = new DownLoad(model.getData()[0].getUrl(), model.getData()[0].getTitle());
            downLoad.load();
        }

    }

    public static void main(String[] args) {
        new Main().run();
    }

}
