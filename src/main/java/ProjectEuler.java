import java.math.BigInteger;
import java.util.*;

public class ProjectEuler {

    public static void main(String[] args) {
        ProjectEuler euler = new ProjectEuler();
        //System.out.println(euler.largestSixDigitPalindrome());
        //System.out.println(euler.smallestMultiple());
        //euler.sumOfSquares();
        //System.out.println(euler.largestProductInSeries());
        // euler.sumOfPrimesBelowTwoMillion();
        //euler.primeFactors(500);
        //euler.pythagoreanTriplet();
        //euler.largestProductInGrid();
        //euler.divisorsOfTriangularNumber();
        //System.out.println(euler.factorial(4));
        //euler.latticePath();
        //euler.latticePathByDynamicProblem(20);
        //euler.twoPower();
        //System.out.println(euler.factorialSum(100));
        euler.amicableNumbers();
    }

    //1
    private void multiplesOf3And5Below1000() {
        /**3+6+9+...999 = 3*(1+2+3+...333)
         5+10+15+..995 = 5*(1+2+3+...199)
         for (int i = 1; i < 1000; i++) {
         if (i % 3 == 0 || i % 5 == 0) {
         sum += i;
         }
         }*/
        System.out.println(sumDivisibleBy(3) + sumDivisibleBy(5) - sumDivisibleBy(15));
    }


    private int sumDivisibleBy(int n) {
        int target = 999;
        int p = target / n;
        return n * p * (p + 1) / 2;
    }

    //2
    private void sumOfEvenFibonaciNumbers() {
        long target = 4000000;
        long prev = 1;
        long current = 2;
        long next = 0;
        long sum = 2;
        while (next < target) {
            next = current + prev;
            prev = current;
            current = next;

            if (next % 2 == 0) {
                sum += next;
            }
        }
        System.out.println(sum);
    }

    //3
    private ArrayList<Long> primeFactors(long n) {
        ArrayList<Long> primeFactors = new ArrayList<>();
        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            //System.out.print(2 + " ");
            primeFactors.add(2L);
            n /= 2;
        }

        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                //System.out.print(i + " ");
                primeFactors.add(i);
                n /= i;
            }
        }

        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2) {
            //System.out.print(n);
            primeFactors.add(n);
        }
        return primeFactors;

    }

    //4 Find the largest palindrome made from the product of two 3-digit numbers.
    private int largestSixDigitPalindrome() {
        /**Let the six digit palindrome be abccba = 100000a+10000b+1000c+100c+10b+a
         * 11(9091a+910b+100c)<=999 pow 2 , so if p and q are three digit numbers then one of them is divisible by 11
         * */
        int largestPalindrome = 0;
        int loopcount = 0;
        /*for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                loopcount++;
                if (isPalindrome(i * j) && largestPalindrome < i * j) {
                    largestPalindrome = i * j;
                }
            }
        }*/
        for (int i = 990; i >= 100; i -= 11) {
            for (int j = 999; j >= 100 && j % 11 != 0; j--) {
                loopcount++;
                if (isPalindrome(i * j) && largestPalindrome < i * j) {
                    largestPalindrome = i * j;
                }
            }
        }
        System.out.println(loopcount);
        return largestPalindrome;
    }

    private boolean isPalindrome(int number) {
        String s = String.valueOf(number);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }

    private int smallestMultiple() {  //5
        //we can find LCM
        int multiple = 1;
        int twoExponent = (int) (Math.log(20) / Math.log(2));
        int threeExponent = (int) (Math.log(20) / Math.log(3));
        multiple *= (int) Math.pow(2, twoExponent) * (int) Math.pow(3, threeExponent);
        for (int i = 4; i <= 20; i++) {
            if (isPrime(i)) {//prime
                multiple *= i;
            }
        }
        return multiple;
    }

    private int calculateExponent(int a, int value) {
        return (int) (Math.log(a) / Math.log(value));
    }

    //6
    private void sumOfSquares() {
        /** n(n+1)/2
         * n(n+1)(2n+1)/6
         * n2(n+1)^2/4
         */
        int sumOfNaturalNumbers = 100 * (100 + 1) / 2;
        int sumOfSquares = 100 * (100 + 1) * (2 * 100 + 1) / 6;
        System.out.println(sumOfNaturalNumbers * sumOfNaturalNumbers - sumOfSquares);
    }

    private void tenThousAndOnePrimeNumber() { //7
        int i = 5;
        int count = 2;
        int lastPrimeNumber = 5;
        ArrayList<Integer> primeList = new ArrayList<>();
        primeList.add(2);
        primeList.add(3);
        while (count < 10001) {
            if (isPrime(i)) {
                count += 1;
                lastPrimeNumber = i;
                // System.out.print(lastPrimeNumber+ " ");
                primeList.add(i);
            }
            i += 2;
        }
        System.out.println(Arrays.toString(primeList.toArray()));
        System.out.println(primeList.size());
        System.out.println(lastPrimeNumber);
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2 || number == 3) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }
        int i = 3;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                return false;
            }
            i += 2;
        }
        return true;
    }

    private long largestProductInSeries() { //8
        String numberString = "7316717653133062491922511967442657474235534919" +
                "49349698352031277450632623957831801698480186947885" +
                "184385861560789112949495459501737958331952853208805" +
                "51112540698747158523863050715693290963295227443043557" +
                "66896648950445244523161731856403098711121722383113" +
                "62229893423380308135336276614282806444486645238749" +
                "30358907296290491560440772390713810515859307960866" +
                "70172427121883998797908792274921901699720888093776" +
                "65727333001053367881220235421809751254540594752243" +
                "52584907711670556013604839586446706324415722155397" +
                "53697817977846174064955149290862569321978468622482" +
                "83972241375657056057490261407972968652414535100474" +
                "82166370484403199890008895243450658541227588666881" +
                "16427171479924442928230863465674813919123162824586" +
                "17866458359124566529476545682848912883142607690042" +
                "24219022671055626321111109370544217506941658960408" +
                "07198403850962455444362981230987879927244284909188" +
                "84580156166097919133875499200524063689912560717606" +
                "05886116467109405077541002256983155200055935729725" +
                "71636269561882670428252483600823257530420752963450";
        int[] totalDigits = new int[numberString.length()];
        for (int i = 0; i < numberString.length(); i++) {
            totalDigits[i] = Character.getNumericValue(numberString.toCharArray()[i]);
        }
        long maxProduct = 1;
        for (int i = 0; i <= totalDigits.length; i++) {
            long product = 1;
            boolean isBreak = false;
            int index = Math.min(totalDigits.length, i + 13);
            for (int j = i; j < index; j++) {
                if (totalDigits[j] == 0) {
                    isBreak = true;
                    break;
                }
                product *= totalDigits[j];
            }
            if (!isBreak && maxProduct < product) {
                maxProduct = product;
            }
        }
        System.out.println(Arrays.toString(totalDigits));
        return maxProduct;
    }

    //https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
    //https://www.mathblog.dk/sum-of-all-primes-below-2000000-problem-10/
    private void sumOfPrimesBelowTwoMillion() { //10
        long start = System.currentTimeMillis();

        int limit = 2 * 1000000;
       /* long sumOfPrimes = 2 + 3;
        int index = 5;
        while (index <= limit) {
            if (isPrime(index)) {
                sumOfPrimes += index;
            }
            index += 2;
        }
        System.out.println(sumOfPrimes);
        System.out.println(System.currentTimeMillis() - start);*/

        int size = limit / 2 - 1;
        //ArrayList<Integer> millionList = new ArrayList<>(limit);
        HashMap<Integer, Boolean> primeMap = new HashMap<>(size);

        primeMap.put(2, true);
        for (int i = 3; i < limit; i += 2) {
            primeMap.put(i, true);
        }
        //int upperSqrt = ((int) Math.sqrt(limit) - 1) / 2;
        for (int p = 3; p < Math.sqrt(limit); p += 2) {
            if (primeMap.get(p)) {//we dont need to check for multiples of p if its already marked
                //i think j is 2p but i^2 works but dont know how it works
                for (int j = p * p; j < limit; j += p) {//we will not mark first prime
                    primeMap.put(j, false);
                }
            }
        }


        long sum = 0;
        sum += 2;
        for (int i = 3; i < limit; i += 2) {
            if (primeMap.get(i)) {
                sum += i;
            }
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(sum);
    }

    private void pythagoreanTriplet() {//9
        /** In pythagorean theorem c^2=a^2+b^2 a<b<c
         * Given any positive integers m and n where m > n > 0, the integers
         * a = m^2-n^2, b = 2m*n, c = m^2+n^2 */
        //m(m+n) = 500 we deduct from a+b+c=1000
        //TODO revisit the best solution
        //TODO write a programme to solve m, n values from equation m(m+n)=500 such that m>n>0
        int[] m = new int[]{20};
        int[] n = new int[]{5};
        for (int i = 0; i < m.length; i++) {
            int a = m[i] * m[i] - n[i] * n[i];
            int c = m[i] * m[i] + n[i] * n[i];
            int b = 2 * m[i] * n[i];
            if (a * a + b * b == c * c && a + b + c == 1000) {
                System.out.println("m:" + m[i] + "," + n[i]);
                System.out.println("a:" + a + ",b:" + b + ",c:" + c);
                System.out.println((double) a * b * c);
                System.out.println("..........................");
            }

        }
    }

    //http://www.geekality.net/2009/10/03/project-euler-problem-11/
    private void largestProductInGrid() {//11
        int[][] grid = new int[][]{
                {8, 2, 22, 97, 38, 15, 0, 40, 0, 75, 4, 5, 7, 78, 52, 12, 50, 77, 91, 8},
                {49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 4, 56, 62, 0},
                {81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 3, 49, 13, 36, 65},
                {52, 70, 95, 23, 4, 60, 11, 42, 69, 24, 68, 56, 1, 32, 56, 71, 37, 2, 36, 91},
                {22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80},
                {24, 47, 32, 60, 99, 3, 45, 2, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50},
                {32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70},
                {67, 26, 20, 68, 2, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21},
                {24, 55, 58, 5, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72},
                {21, 36, 23, 9, 75, 0, 76, 44, 20, 45, 35, 14, 0, 61, 33, 97, 34, 31, 33, 95},
                {78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 3, 80, 4, 62, 16, 14, 9, 53, 56, 92},
                {16, 39, 5, 42, 96, 35, 31, 47, 55, 58, 88, 24, 0, 17, 54, 24, 36, 29, 85, 57},
                {86, 56, 0, 48, 35, 71, 89, 7, 5, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58},
                {19, 80, 81, 68, 5, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 4, 89, 55, 40},
                {4, 52, 8, 83, 97, 35, 99, 16, 7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66},
                {88, 36, 68, 87, 57, 62, 20, 72, 3, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69},
                {4, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36},
                {20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 4, 36, 16},
                {20, 73, 35, 29, 78, 31, 90, 1, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 5, 54},
                {1, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 1, 89, 19, 67, 48}
        };

        long largestProduct = 0;

        long start = System.currentTimeMillis();

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (j + 3 < 20) {
                    long rowProduct = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
                    largestProduct = Math.max(largestProduct, rowProduct);
                }
                /*if (i + 3 < 20) {
                    long colProduct = grid[i][j] * grid[i + 1][j] * grid[i + 2][j] * grid[i + 3][j];
                    largestProduct = Math.max(largestProduct, colProduct);
                }*/

                if (i + 3 < 20 && j + 3 < 20) {
                    long diagonalProduct = grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2] * grid[i + 3][j + 3];
                    largestProduct = Math.max(largestProduct, diagonalProduct);
                }

                /*if (i - 3 >= 0 && j - 3 >= 0) {
                    long diagonalProduct1 = grid[i][j] * grid[i - 1][j - 1] * grid[i - 2][j - 2] * grid[i - 3][j - 3];
                    largestProduct = Math.max(largestProduct, diagonalProduct1);
                }*/

                /*if (i - 3 >= 0) {
                    long colProduct1 = grid[i][j] * grid[i - 1][j] * grid[i - 2][j] * grid[i - 3][j];
                    largestProduct = Math.max(largestProduct, colProduct1);
                }*/

                /*if (i - 3 >= 0 && j + 3 < 20) {
                    long diagonalProductdi1 = grid[i][j] * grid[i - 1][j + 1] * grid[i - 2][j + 2] * grid[i - 3][j + 3];
                    largestProduct = Math.max(largestProduct, diagonalProductdi1);
                }*/

                if (i + 3 < 20 && j - 3 >= 0) {
                    long diagonalProductdi2 = grid[i][j] * grid[i + 1][j - 1] * grid[i + 2][j - 2] * grid[i + 3][j - 3];
                    largestProduct = Math.max(largestProduct, diagonalProductdi2);
                }


                if (j - 3 >= 0) {
                    long rowProduct1 = grid[i][j] * grid[i][j - 1] * grid[i][j - 2] * grid[i][j - 3];
                    largestProduct = Math.max(largestProduct, rowProduct1);
                }


            }
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(largestProduct);
    }

    private int divisorsCount(long n) {
        //prime factorization (exponent1 +1)*(exponent+1)
        ArrayList<Long> primeList = primeFactors(n);
        Set<Long> uniqueSet = new HashSet<>(primeList);
        ArrayList<Long> uniqueArrayList = new ArrayList<>(uniqueSet);
        //System.out.println(Arrays.toString(primeList.toArray()));
        int numOfFactors = 1;
        for (int i = 0; i < uniqueArrayList.size(); i++) {
            int exponent = 0;
            for (int j = 0; j < primeList.size(); j++) {
                if (uniqueArrayList.get(i) % primeList.get(j) == 0) {
                    exponent += 1;
                }
            }
            numOfFactors *= (exponent + 1);
        }
        /*ArrayList<Long> factorList = new ArrayList<>();
        for (long i = 1; i <= n; i++) {
            if (n % i == 0) {
                factorList.add(i);
            }
        }*/
        return numOfFactors;
    }

    private void divisorsOfTriangularNumber() {//12
        //TODO write an efficient algorithm for prime number and finding prime factorization of a given number
        long start = System.currentTimeMillis();
        int i = 1;
        int triangularNumber = 1;
        while (divisorsCount(triangularNumber) < 500) {
            i++;
            triangularNumber = i * (i + 1) / 2;
        }
        System.out.println(triangularNumber);
        System.out.println(System.currentTimeMillis() - start);
        //System.out.println(divisorsCount(14414400));
    }

    private void largeSum() {//13  29/4/2019
        long start = System.currentTimeMillis();
        String s = "37107287533902102798797998220837590246510135740250" +
                "46376937677490009712648124896970078050417018260538" +
                "74324986199524741059474233309513058123726617309629" +
                "91942213363574161572522430563301811072406154908250" +
                "23067588207539346171171980310421047513778063246676" +
                "89261670696623633820136378418383684178734361726757" +
                "28112879812849979408065481931592621691275889832738" +
                "44274228917432520321923589422876796487670272189318" +
                "47451445736001306439091167216856844588711603153276" +
                "70386486105843025439939619828917593665686757934951" +
                "62176457141856560629502157223196586755079324193331" +
                "64906352462741904929101432445813822663347944758178" +
                "92575867718337217661963751590579239728245598838407" +
                "58203565325359399008402633568948830189458628227828" +
                "80181199384826282014278194139940567587151170094390" +
                "35398664372827112653829987240784473053190104293586" +
                "86515506006295864861532075273371959191420517255829" +
                "71693888707715466499115593487603532921714970056938" +
                "54370070576826684624621495650076471787294438377604" +
                "53282654108756828443191190634694037855217779295145" +
                "36123272525000296071075082563815656710885258350721" +
                "45876576172410976447339110607218265236877223636045" +
                "17423706905851860660448207621209813287860733969412" +
                "81142660418086830619328460811191061556940512689692" +
                "51934325451728388641918047049293215058642563049483" +
                "62467221648435076201727918039944693004732956340691" +
                "15732444386908125794514089057706229429197107928209" +
                "55037687525678773091862540744969844508330393682126" +
                "18336384825330154686196124348767681297534375946515" +
                "80386287592878490201521685554828717201219257766954" +
                "78182833757993103614740356856449095527097864797581" +
                "16726320100436897842553539920931837441497806860984" +
                "48403098129077791799088218795327364475675590848030" +
                "87086987551392711854517078544161852424320693150332" +
                "59959406895756536782107074926966537676326235447210" +
                "69793950679652694742597709739166693763042633987085" +
                "41052684708299085211399427365734116182760315001271" +
                "65378607361501080857009149939512557028198746004375" +
                "35829035317434717326932123578154982629742552737307" +
                "94953759765105305946966067683156574377167401875275" +
                "88902802571733229619176668713819931811048770190271" +
                "25267680276078003013678680992525463401061632866526" +
                "36270218540497705585629946580636237993140746255962" +
                "24074486908231174977792365466257246923322810917141" +
                "91430288197103288597806669760892938638285025333403" +
                "34413065578016127815921815005561868836468420090470" +
                "23053081172816430487623791969842487255036638784583" +
                "11487696932154902810424020138335124462181441773470" +
                "63783299490636259666498587618221225225512486764533" +
                "67720186971698544312419572409913959008952310058822" +
                "95548255300263520781532296796249481641953868218774" +
                "76085327132285723110424803456124867697064507995236" +
                "37774242535411291684276865538926205024910326572967" +
                "23701913275725675285653248258265463092207058596522" +
                "29798860272258331913126375147341994889534765745501" +
                "18495701454879288984856827726077713721403798879715" +
                "38298203783031473527721580348144513491373226651381" +
                "34829543829199918180278916522431027392251122869539" +
                "40957953066405232632538044100059654939159879593635" +
                "29746152185502371307642255121183693803580388584903" +
                "41698116222072977186158236678424689157993532961922" +
                "62467957194401269043877107275048102390895523597457" +
                "23189706772547915061505504953922979530901129967519" +
                "86188088225875314529584099251203829009407770775672" +
                "11306739708304724483816533873502340845647058077308" +
                "82959174767140363198008187129011875491310547126581" +
                "97623331044818386269515456334926366572897563400500" +
                "42846280183517070527831839425882145521227251250327" +
                "55121603546981200581762165212827652751691296897789" +
                "32238195734329339946437501907836945765883352399886" +
                "75506164965184775180738168837861091527357929701337" +
                "62177842752192623401942399639168044983993173312731" +
                "32924185707147349566916674687634660915035914677504" +
                "99518671430235219628894890102423325116913619626622" +
                "73267460800591547471830798392868535206946944540724" +
                "76841822524674417161514036427982273348055556214818" +
                "97142617910342598647204516893989422179826088076852" +
                "87783646182799346313767754307809363333018982642090" +
                "10848802521674670883215120185883543223812876952786" +
                "71329612474782464538636993009049310363619763878039" +
                "62184073572399794223406235393808339651327408011116" +
                "66627891981488087797941876876144230030984490851411" +
                "60661826293682836764744779239180335110989069790714" +
                "85786944089552990653640447425576083659976645795096" +
                "66024396409905389607120198219976047599490197230297" +
                "64913982680032973156037120041377903785566085089252" +
                "16730939319872750275468906903707539413042652315011" +
                "94809377245048795150954100921645863754710598436791" +
                "78639167021187492431995700641917969777599028300699" +
                "15368713711936614952811305876380278410754449733078" +
                "40789923115535562561142322423255033685442488917353" +
                "44889911501440648020369068063960672322193204149535" +
                "41503128880339536053299340368006977710650566631954" +
                "81234880673210146739058568557934581403627822703280" +
                "82616570773948327592232845941706525094512325230608" +
                "22918802058777319719839450180888072429661980811197" +
                "77158542502016545090413245809786882778948721859617" +
                "72107838435069186155435662884062257473692284509516" +
                "20849603980134001723930671666823555245252804609722" +
                "53503534226472524250874054075591789781264330331690";


        BigInteger sum = BigInteger.valueOf(0);
        ArrayList<BigInteger> fiftyDigitNumberList = new ArrayList<>(100);
        for (int i = 0; i + 49 < s.length(); i += 50) {//Divide into fifty digit numbers
            fiftyDigitNumberList.add(new BigInteger(s.substring(i, i + 49)));
        }

        for (int i = 0; i < 100; i++) {
            sum = sum.add(fiftyDigitNumberList.get(i));
        }
        String stringSum = sum.toString();
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(stringSum.substring(0, 10));
    }

    private void collatzSequence() {//14   29/4/2019
        long start = System.currentTimeMillis();
        int limit = 1000000;
        long n;
        int largestChainCount = 0;
        int startingNumber = 0;
        int[] cache = new int[limit];
        for (int i = 0; i < cache.length; i++) {
            cache[i] = 0;
        }
        for (int i = 2; i < limit; i++) {
            n = i;
            int chainCount = 1;
            while (n != 1 && n >= i) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                if (n < 0) {
                    System.out.println("-ve for i=" + i);
                    System.exit(0);
                }
                chainCount++;
            }
            cache[i] = chainCount + cache[(int) n];
            if (cache[i] > largestChainCount) {
                largestChainCount = cache[i];
                startingNumber = i;
            }
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(startingNumber);
    }

    private BigInteger factorial(int n) {
        BigInteger bigIntegerN = new BigInteger(String.valueOf(n));
        if (n == 0 || n == 1) {
            return BigInteger.valueOf(1);
        } else {
            return bigIntegerN.multiply(factorial(n - 1));
        }
    }

    private void latticePath() {// 15 30/4/2019
        //int numerator = 20 + 20;
        //(a+b)!/(a+b-b)!*b!
        long start = System.currentTimeMillis();
        BigInteger factorial20 = factorial(20);
        BigInteger denominator = factorial20.multiply(factorial20);
        BigInteger factorial40 = factorial(40);
        factorial40 = factorial40.divide(denominator);
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(factorial40);
    }

    private void latticePathByDynamicProblem(int n) {// 15 30/4/2019
        long start = System.currentTimeMillis();
        String[][] grid = new String[n + 1][n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                grid[i][j] = "0";
            }
        }
        for (int i = 0; i < grid.length - 1; i++) {
            grid[i][grid.length - 1] = "1";
            grid[grid.length - 1][i] = "1";
        }
        BigInteger value1 = BigInteger.valueOf(0);
        BigInteger value2 = BigInteger.valueOf(0);
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid.length - 1; j >= 0; j--) {
                if (i + 1 < grid.length) {
                    value1 = new BigInteger(grid[i + 1][j]);
                }
                if (j + 1 < grid.length) {
                    value2 = new BigInteger(grid[i][j + 1]);
                }
                if (!grid[i][j].equals("1")) {
                    grid[i][j] = value1.add(value2).toString();
                }
            }
        }
        //BigInteger result;
        //result = gridRecursion(grid, 1, 0).add(gridRecursion(grid, 0, 1));
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(grid[0][0]);
        //System.out.println(result);
    }

    private BigInteger gridRecursion(String[][] grid, int row, int col) {
        if (row == grid.length || col == grid.length) {
            return BigInteger.valueOf(0);
        } else if (!grid[row][col].equals("0")) {
            return new BigInteger(grid[row][col]);
        } else {
            BigInteger value1 = gridRecursion(grid, row + 1, col);
            BigInteger value2 = gridRecursion(grid, row, col + 1);
            if (row + 1 < grid.length && col < grid.length) {
                grid[row + 1][col] = value1.toString();
            }
            if (col + 1 < grid.length) {
                grid[row][col + 1] = value2.toString();
            }
            return value1.add(value2);
        }
    }

    private void twoPower() {//16 30/4/2019
        BigInteger bigInteger = BigInteger.valueOf(1);
        for (int i = 0; i < 1000; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(2));
        }
        String sum = bigInteger.toString();
        int sumInteger = 0;
        for (int i = 0; i < sum.length(); i++) {
            sumInteger += Character.getNumericValue(sum.charAt(i));
        }
        System.out.println(sumInteger);
    }

    private void trianglePathSum() {//18 01/05/2019 PENDING
        int[][] array = new int[][]{
                {75}, {95, 64},
                {17, 47, 82},
                {18, 35, 87, 10},
                {20, 4, 82, 47, 65},
                {19, 1, 23, 75, 3, 34},
                {88, 2, 77, 73, 7, 63, 67},
                {99, 65, 4, 28, 6, 16, 70, 92},
                {41, 41, 26, 56, 83, 40, 80, 70, 33},
                {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
                {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
                {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
                {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
                {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
                {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23}
        };
    }

    private BigInteger factorialByLoop(int n) {
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    private int factorialSum(int n) {//20 1/5/2019
        String s = factorialByLoop(n).toString();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Character.getNumericValue(s.charAt(i));
        }
        return sum;
    }

    private void amicableNumbers() {
        long start = System.currentTimeMillis();
        int[] divisorSumArray = new int[10001];
        for (int i = 1; i < 10001; i++) {
            int divisorSum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    divisorSum += j;
                }
            }
            divisorSumArray[i] = divisorSum;
        }
        for (int i = 0; i < 10001; i++) {
            System.out.println(i + " " + divisorSumArray[i]);
        }

        int sumOfAllAmicableNumbers = 0;
        ArrayList<Integer> vistedIndex = new ArrayList<>();
        for (int i = 1; i < 10001; i++) {
            int indexValue = divisorSumArray[i];
            if (indexValue < 10001 && !vistedIndex.contains(indexValue) && i == divisorSumArray[indexValue]) {
                sumOfAllAmicableNumbers += i + indexValue;
                vistedIndex.add(i);
                vistedIndex.add(indexValue);
            }
        }
        System.out.println(Arrays.toString(vistedIndex.toArray()));
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(sumOfAllAmicableNumbers);
    }
}
