package main.scala.paristech

import com.amazonaws.services.s3.AmazonS3Client
import com.amazonaws.auth.BasicAWSCredentials


object AwsS3Client {
  val AWS_ID = ""
  val AWS_KEY = ""

  val BUCKET = "projet-nosql"

  val s3 = new AmazonS3Client(new BasicAWSCredentials(AWS_ID, AWS_KEY))
}
