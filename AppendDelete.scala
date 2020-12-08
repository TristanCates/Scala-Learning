import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    // Complete the appendAndDelete function below.
    def appendAndDelete(s: String, t: String, k: Int): String = {
        var changes = 0
        var shortestLength = 0
        var longLength = 0
        
        if (s.length() <= t.length()){
            shortestLength = s.length()
            longLength = t.length()
        }
        else{
            shortestLength = t.length()
            longLength = s.length()
        }
        
        changes += longLength-shortestLength
        for(i <- 0 to shortestLength-1)
            if (s(i) != t(i)){
                changes += 2 //remove and add differing letters takes 2 changes
            }
            
        if (changes <= k){
            "Yes"
        }
        else{
            "No"
        }
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val s = stdin.readLine

        val t = stdin.readLine

        val k = stdin.readLine.trim.toInt

        val result = appendAndDelete(s, t, k)

        printWriter.println(result)

        printWriter.close()
    }
}
