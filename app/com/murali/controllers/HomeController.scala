package com.murali.controllers


import com.mohiva.play.silhouette.api.{Silhouette, SilhouetteProvider}
import com.murali.utils.auth.DefaultEnv
import com.murali.views.html._
import controllers.AssetsFinder
import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}

import scala.concurrent.ExecutionContext.Implicits.global


@Singleton
class HomeController @Inject()(cc: ControllerComponents,
                               silhouette: SilhouetteProvider[DefaultEnv])(implicit assetsFinder: AssetsFinder) extends AbstractController(cc){

  def home = Action {implicit request =>

    Ok(index(""))
  }


  def secure = silhouette.SecuredAction  {implicit request =>

    Ok(checkout("You have been authorized", request.identity))
  }


  def login = Action {request =>
    Ok(loginpage(""))
  }


  def register = Action {request =>
    Ok(registerpage(""))
  }



}
