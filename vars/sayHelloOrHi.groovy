node{
def call(String sayWhat="nothing"){
    if(sayWhat=="hi"){
        script{
            bat """
                echo Hi Zartab
            """
        }
    } 
    else if(sayWhat=="hello"){
         script{
            bat """
                echo Hello Zartab
            """
         }
    }
    else{
         script{
            bat """
                echo Whats Up Zartab
            """
         }
    }
}
}
