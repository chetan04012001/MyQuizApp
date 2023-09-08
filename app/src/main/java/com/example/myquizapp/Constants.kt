package com.example.myquizapp

object Constants {
    const val USER_NAME :String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"




    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1= Question(
            1,"what country does this flag belong to?",
            R.drawable.brazil,
            "Argentina","Australia","Brazil","Austria",
            3
        )
        questionsList.add(que1)
        val que2= Question(
            1,"what country does this flag belong to?",
            R.drawable.german,
            "Argentina","Germany","Brazil","Austria",
            2
        )
        questionsList.add(que2)

        val que3= Question(
            1,"what country does this flag belong to?",
            R.drawable.china,
            "China","Nepal","Brazil","Armenia",
            1
        )
        questionsList.add(que3)

        val que4= Question(
            1,"what country does this flag belong to?",
            R.drawable.kuwait,
            "China","Nepal","kuwait","croatia",
            3
        )
        questionsList.add(que4)

        val que5= Question(
            1,"what country does this flag belong to?",
            R.drawable.vietnam,
            "China","Nepal","Veitnam","Iraq",
            3
        )
        questionsList.add(que5)

        val que6= Question(
            1,"what country does this flag belong to?",
            R.drawable.india1,
            "India","Nepal","Bhutan","Bangladesh",
            1
        )
        questionsList.add(que6)

        val que7= Question(
            1,"what country does this flag belong to?",
            R.drawable.usa,
            "Chile","USA","NewZealand","Armenia",
            2
        )
        questionsList.add(que7)
        return questionsList
    }


}