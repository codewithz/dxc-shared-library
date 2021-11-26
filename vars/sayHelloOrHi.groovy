def call(String sayWhat="nothing"){
    if(sayWhat=="hi"){
        
            bat """
                echo Hi Zartab
            """
        
    } 
    else if(sayWhat=="hello"){
         
            bat """
                echo Hello Zartab
            """
         
    }
    else{
         
            bat """
                echo Whats Up Zartab
            """
         
    }
}
