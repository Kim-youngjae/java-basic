package javajungsuk.exercises;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < cards.length ; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard2(num, isKwang);
        }
    }

    public void shuffle() {
        //cards에 담긴 카드의 위치를 뒤섞는다
        for (int i = 0; i < cards.length; i++) {
            int index1 = (int) (Math.random() * 20);

            SutdaCard2 temp = cards[index1];
            cards[index1] = cards[i];
            cards[i] = temp;
        }
    }

    public SutdaCard2 pick(int index) {
        if (index < 0 || index > CARD_NUM) {
            return null;
        } // 유효성 검사 부분 생각하기

        return cards[index];
    }

    public SutdaCard2 pick() {
        return cards[(int) (Math.random() * 20) + 1];
    }
}

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2() {
        this(1, true);
    }

    public SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

public class Ex7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

//        for (int i = 0; i < deck.cards.length; i++) {
//            System.out.print(deck.cards[i].toString() + ",");
//        }
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }

        System.out.println();
        System.out.println(deck.pick(0));

    }
}
