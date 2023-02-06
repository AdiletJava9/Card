public class Wallet {

    long WalletMoney;
    long card;

    long payWithCArd(long a) {
        return card -= a;
    }

    long payInCash(long b) {
        if (WalletMoney > 500) {
            return WalletMoney -= b;
        }
        return b;
    }

    long cashOut (long minus){
        long y = card-minus;
        return y;


    } public  long plus(){
        return  plus()+WalletMoney;
    }


}