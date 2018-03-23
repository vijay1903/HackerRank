class Student extends Person{
	private int[] testScores;
    Student(String firstName, String lastName, int identification, int[] scores){
        super(firstName, lastName, identification);
        this.testScores = scores;
    }
    public char calculate()
        {
        int avg = 0, sum = 0;
        for(int i = 0; i < testScores.length;i++)
        sum += testScores[i];
        avg =(sum / (testScores.length));
        if(avg >= 90)
        return 'O';
        else if(avg >= 80)
        return 'E';
        else if(avg >= 70)
        return 'A';
        else if(avg >= 55)
        return 'P';
        else if(avg >= 40)
        return 'D';
        else
        return 'T';
        }
}
