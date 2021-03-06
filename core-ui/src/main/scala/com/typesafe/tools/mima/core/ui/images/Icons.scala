package com.typesafe.tools.mima.core.ui.images

import java.io.File
import java.net.URL

import scala.swing._
import Swing._

/** Icons should be added in the `resources` folder. It assumes that icons can be found in
 *  the same package location of this class.
 */
object Icons {

  private lazy val sep = File.separator

  private def getIcon = buildIcon _

  /** Load the icon from the given path, or EmptyIcon if not found. */
  private def buildIcon(filename: String): javax.swing.Icon = {
    getClass.getResource(filename) match {
      case null => EmptyIcon
      case value =>
        val resource = Swing.Icon(value)
        if (resource eq null) EmptyIcon else resource
    }
  }

  lazy val typesafe = getIcon("typesafe.png")
  lazy val scalaLogo = getIcon("scala_logo.png")

  lazy val exit = getIcon("exit.png")
  lazy val broken = getIcon("broken.png")
  lazy val alert = getIcon("alert.png")

  lazy val migration = getIcon("migration.jpg")
  lazy val check = getIcon("check.jpg")

  lazy val add = getIcon("add.png")
  lazy val remove = getIcon("remove.png")
  lazy val up = getIcon("up.png")
  lazy val down = getIcon("down.png")

  lazy val close = getIcon("close.gif")

}