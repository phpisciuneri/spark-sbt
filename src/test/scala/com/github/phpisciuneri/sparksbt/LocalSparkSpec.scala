package com.github.phpisciuneri.sparksbt

import org.scalatest.{FunSpec, Matchers}

class LocalSparkSpec extends FunSpec with Matchers with LocalSpark {

  describe("LocalSpark") {

    import spark.implicits._

    it("should be able to create and count a DataFrame") {
      Seq(0, 1, 2, 3, 4).toDF("number").count shouldBe 5
    }

  }

}