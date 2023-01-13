package javajungsuk.youtube;

enum Direction { EAST, SOUTH, WEST, NORTH } // 값이 0, 1, 2, 3 자동 부여

class EnumUnit{
    Direction2 dir;
}

class EnumEx1 {
    public static void main(String[] args) {
        Direction2 d1 = Direction2.EAST;
        Direction2 d2 = Direction2.valueOf("WEST");
        Direction2 d3 = Enum.valueOf(Direction2.class, "EAST");

        System.out.println("d1="+d1);
        System.out.println("d2="+d2);
        System.out.println("d3="+d3);

        System.out.println("d1==d2 ? "+ (d1==d2));
        System.out.println("d1==d3 ? "+ (d1==d3));
        System.out.println("d1.equals(d3) ? "+ d1.equals(d3));
//		System.out.println("d2 > d3 ? "+ (d1 > d3)); // 에러. 크기 비교 연산자 불가능 compareTo()로 비교
        System.out.println("d1.compareTo(d3) ? "+ (d1.compareTo(d3)));
        System.out.println("d1.compareTo(d2) ? "+ (d1.compareTo(d2)));

        switch(d1) {
            case EAST: // Direction.EAST¶ó°í ¾µ ¼ö ¾ø´Ù.
                System.out.println("The direction is EAST.");
                break;
            case SOUTH:
                System.out.println("The direction is SOUTH.");
                break;
            case WEST:
                System.out.println("The direction is WEST.");
                break;
            case NORTH:
                System.out.println("The direction is NORTH.");
                break;
            default:
                System.out.println("Invalid direction.");
//				break;
        }

        Direction2[] dArr = Direction2.values();

        for(Direction2 d : dArr)  // for(Direction d : Direction.values())
            System.out.printf("%s=%d%n", d.name(), d.ordinal());
    }
}