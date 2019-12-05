package com.edu.neu.csye7200.finalproject.Schema

import org.apache.spark.sql.types._

object BookSchema {


  val bookSchema=StructType(
    Seq(
      StructField("ISBN", IntegerType, true),
      StructField("Book-Title", StringType, true),
      StructField("Book-Author",StringType, true),
      StructField("Year-Of-Publication",StringType, true),
      StructField("Publisher",StringType, true),
      StructField("Image-URL-S",StringType, true),
      StructField("Image-URL-M",StringType, true),
      StructField("Image-URL-L",StringType, true)
    )
  )


  val fullbookSchema=StructType(
    Seq(
      StructField("adult", BooleanType, true),
      StructField("belongs_to_collection", StringType, true),
      StructField("budget",IntegerType, true),
      StructField("genres",StringType, true),
      StructField("homepage",StringType, true),
      StructField("id",IntegerType, true),
      StructField("imdb_id",IntegerType, true),
      StructField("original_language",StringType, true),
      StructField("original_title",StringType, true),
      StructField("overview",StringType, true),
      StructField("popularity",DoubleType, true),
      StructField("poster_path",StringType, true),
      StructField("production_companies",StringType, true),
      StructField("production_countries",StringType, true),
      StructField("release_date",DateType, true),
      StructField("revenue",IntegerType, true),
      StructField("runtime",FloatType, true),
      StructField("spoken_languages",StringType, true),
      StructField("status",StringType, true),
      StructField("tagline",StringType, true),
      StructField("title",StringType, true),
      StructField("video",BooleanType, true),
      StructField("vote_average",FloatType, true),
      StructField("vote_count",IntegerType, true)
    )
  )
  val linkdataSchema=StructType(
    Seq(
      StructField("movieId", IntegerType, false),
      StructField("imdbId", StringType, false),
      StructField("tmdbId", IntegerType, false)
    )


  )
}
