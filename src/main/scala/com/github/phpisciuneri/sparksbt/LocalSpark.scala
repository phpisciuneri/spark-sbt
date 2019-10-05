package com.github.phpisciuneri.sparksbt

import org.apache.spark.SparkContext
import org.apache.spark.sql.{SQLContext, SparkSession}

trait LocalSpark {
  val spark: SparkSession = LocalSpark.sparkSession
  val sc: SparkContext = spark.sparkContext
  val sqlContext: SQLContext = spark.sqlContext
}

object LocalSpark {
  val sparkSession: SparkSession = SparkSession
    .builder()
    .appName("sparksbt")
    .master("local[4]")
    .config("spark.executor.memory", "512mb")
    .config("spark.driver.memory", "1024mb")
    .config("spark.driver.host", "localhost")
    .getOrCreate()

  sparkSession.sparkContext.setLogLevel("WARN")
}
