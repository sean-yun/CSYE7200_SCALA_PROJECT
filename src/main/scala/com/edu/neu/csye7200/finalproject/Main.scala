package com.edu.neu.csye7200.finalproject
import com.edu.neu.csye7200.finalproject.API.BookRecommendation

import scala.util.control.Breaks._
import scala.util.{Failure, Success, Try}

object Main extends App {
  def ToInt(line: String): Try[Int] = {
    Try(line.toInt)
  }

  override def main(args: Array[String]): Unit = {

    breakable {
      while (true) {
        println("\n|-----------------------------------------------|" +
          "\n|------Book Recommendation System------|" +
          "\n|-----------------------------------------------|" +
          "\nTell me Who you are by Entering your ID: "
        )
        val id = scala.io.StdIn.readLine()

        breakable {
          while (true) {
            ToInt(id) match {
              case Success(t) => {

                println("\n|-----------------------------------------------|" +
                  "\n|------Book Recommendation System------|" +
                  "\n|-----------------------------------------------|"+
                "\nHi! User: [" +id+"]"+
                  "\n "+
                  "\n↓↓↓↓↓↓↓↓↓↓↓↓↓Select Functions to continue with ↓↓↓↓↓↓↓↓↓↓↓↓↓")
                println("1.Book Recommendation by your interests" +
                  "\n2.Book Rating Update" )
                var  num =scala.io.StdIn.readLine()

                breakable {
                  while (true) {
                    ToInt(num) match {
                      case Success(t)=>{
                        t match{
                          case 1=>{ println("|------Processing the Recommendation Algorithm....------|" )
                            BookRecommendation.getRecommendation(id.toInt)
                            //                           scala.io.StdIn.readLine()
                             break
                          }
                          case 2=>{
                            println(
                              "\n/------Please Enter the BookName you want to rate------/")
                            val content=scala.io.StdIn.readLine()

                            breakable {
                              while (true) {
                                println("Enter your rating score[0~10]: ")
                                val rating=scala.io.StdIn.readLine()

                                Try(rating.toFloat) match{
                                  case Success(r)=> {
                                    if(r>=0&&r<=10) {
                                      BookRecommendation.UpdateRatingsByRecommendation(List(id.toInt.toString, r.toString,
                                        (System.currentTimeMillis()%10000000000.00).toLong.toString), content)
                                      break
                                    }
                                    else {
                                      println("out of range")
                                    }
                                  }
                                  case Failure(r)=>
                                }

                              }
                            }
                          }
                          case _=>break
                        }

                      }
                      case Failure(e)=>break
                    }
                  }
                }
              }
              case Failure(e)=> break
            }

          }
        }
      }
    }
  }
}
