import java.util.Scanner;

public class LeakyBucket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the bucket size: ");
        int bsize = sc.nextInt();

        System.out.print("Enter the output rate: ");
        int op_rate = sc.nextInt();

        System.out.print("Enter the number of packets: ");
        int num = sc.nextInt();

        int pkts[] = new int[num];

        System.out.println("Enter the packets: ");

        for (int i = 0; i < num; i++) {
            pkts[i] = sc.nextInt();
        }

        System.out.println("Rec_Pkt_Size \tBuc_Content \t Ac/Rej \tRem_Buc_Content");
        System.out.println("----------------------------------------------------------------");

        int Rec_Pkt_Size, Rem_Buc_Content = 0, Buc_Content = 0;

        for (int i = 0; i < num; i++) {
            Rec_Pkt_Size = pkts[i];
            Buc_Content = Rec_Pkt_Size + Rem_Buc_Content;

            if (Buc_Content > bsize) {
                Buc_Content = Rem_Buc_Content;
                Rem_Buc_Content = Buc_Content - op_rate;

                if (Rem_Buc_Content < 0) {
                    Rem_Buc_Content = 0;
                }

                System.out.println(Rec_Pkt_Size + " \t\t" + Buc_Content + " \t\t" + " Rej \t " + Rem_Buc_Content);
            } else {
                Rem_Buc_Content = Buc_Content - op_rate;

                if (Rem_Buc_Content < 0) {
                    Rem_Buc_Content = 0;
                }

                System.out.println(Rec_Pkt_Size + " \t\t" + Buc_Content + " \t\t" + " Acc \t " + Rem_Buc_Content);
            }
        }

        while (Rem_Buc_Content > 0) {
            Buc_Content = Rem_Buc_Content;
            Rem_Buc_Content = Rem_Buc_Content - op_rate;

            if (Rem_Buc_Content < 0) {
                Rem_Buc_Content = 0;
            }

            System.out.println("-- " + " \t " + Buc_Content + " \t " + " --\t " + Rem_Buc_Content);
        }
    }
}

/*
Enter the bucket size: 20
Enter the output rate: 5
Enter the number of packets: 6
Enter the packets:
7
9
15
4
6
1

Rec_Pkt_Size   Buc_Content    Ac/Rej    Rem_Buc_Content
----------------------------------------------------------------
7              7              Acc       2
9              16             Acc       11
15             31             Rej       26
4              4              Acc       0
6              10             Acc       5
1              11             Acc       6
--             6              --        1
--             1              --        0


*/
