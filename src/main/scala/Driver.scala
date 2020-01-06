import org.apache.spark.{SparkConf, SparkContext}

object Driver {
  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Zarate")
    val sc = new SparkContext(sparkConf)

    val arr = sc.parallelize(Array(10,20,30))
    println(arr.reduce(_ + _))
  }
}
