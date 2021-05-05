package com.github.joeqcao.layzee

import org.apache.spark.sql.SparkSession

object DataFrameObserver {
  def read_df_info(filePath:String): Unit ={
    val spark = SparkSession.builder
      .master("local")
      .appName("SparkTest")
      .getOrCreate()
    val df = spark.read.csv(filePath)
    df.printSchema()
    df.show()
  }
}
