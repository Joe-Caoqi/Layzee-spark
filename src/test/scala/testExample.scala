import com.github.joeqcao.layzee.{DataFrameObserver => Function}
object testExample {
  def main(args: Array[String]): Unit = {
    Function.read_df_info(filePath = "/Users/joecao/code_garage/scala-garage/samplecsv.csv")
  }
}
