//Dan Rojas
//25 Jan 26
//mod 3.2

//Creates requested pyramid.

public class Pyramid {
    public static void main(String[] args) {

        int MAX_LINE_LENGTH = 31;
        int TOTAL_ROWS = 7;

        //Loop over rows
        for (int row = 0; row < TOTAL_ROWS; row++) {

            StringBuilder sb = new StringBuilder();

            //Add leading whitespace
            for (int leadingSpace = 0; leadingSpace < (TOTAL_ROWS - row) * 2 - 1; leadingSpace++) {
                if (row == 6) {
                    break;
                }
                sb.append(" ");
            }


            //increase
            int value = 1;
            for (int i = 0; i <= row; i++) {
                sb.append(value).append(" ");
                value *= 2;
            }


            //decrease
            value /= 4;
            for (int i = 0; i < row; i++) {
                sb.append(value).append(" ");
                value /= 2;
            }


            //add trailing whitespace
            while (sb.length() < MAX_LINE_LENGTH) {
                sb.append(" ");
            }
            sb.append("@");


            //print line
            System.out.println(sb);
        }
    }
}
