package day12_equals;



public class USCoinMain {
    public static void main(String[] args) {
        USCurrency uscoin =USCurrency.NICKLE;
        System.out.println("得到" + uscoin.getValue() + "美分硬幣一枚");
        uscoin =USCurrency.valueOf("QUARTER");
        System.out.println("得到" + uscoin.getValue() + "美分硬幣一枚");
        for(USCurrency coin: USCurrency.values()){
            System.out.print(coin.getClass().getSimpleName());
            System.out.println(":" + coin.getValue());
        }
    }
}
