open OCanren

type jtype_injected = int OCanren.ilogic
type decl_injected = int OCanren.ilogic

[@@@klogic.preamble
  {|// Autogenerated file
@file:Suppress("FunctionName", "NonAsciiCharacters", "TestFunctionName")

package utils

import org.klogic.core.*
import org.klogic.utils.terms.LogicList
import org.klogic.utils.terms.LogicList.Companion.logicListOf
import org.klogic.utils.terms.Nil.nilLogicList
import org.klogic.utils.terms.plus
import utils.LogicInt.Companion.toLogic

val digitZero: Digit = 0.toLogic()
val digitOne: Digit = 1.toLogic()

typealias Digit = LogicInt
typealias OlegLogicNumber = LogicList<Digit>
typealias OlegTerm = Term<OlegLogicNumber>

val zero: OlegLogicNumber = logicListOf()
val one: OlegLogicNumber = logicListOf( 1.toLogic() )
val three: OlegLogicNumber = logicListOf( 1.toLogic(), 1.toLogic() )

fun UInt.toOlegLogicNumber(): OlegLogicNumber = toLogicList()
fun UInt.toLogicList(): LogicList<Digit> =
    when {
        this == 0u -> nilLogicList()
        this % 2u == 0u -> digitZero + (this / 2u).toLogicList()
        else -> digitOne + (this / 2u).toLogicList()
    }

fun  pause(f: () -> Goal): Goal = { st -> ThunkStream { f()(st) } }
|}]

[@@@klogic.epilogue {|// Put epilogue here |}]

[@@@klogic.type.mangle
  [ "int OCanren.ilogic OCanren.Std.List.injected", "OlegTerm"
  ; "string OCanren.ilogic OCanren.Std.List.injected", "Term<LogicList<LogicString>>"
  ; "int OCanren__.Logic.ilogic", "Term<LogicInt>"
  ; "string OCanren__.Logic.ilogic", "Term<LogicString>"
  ; ( "(int OCanren__.Logic.ilogic, int OCanren__.Logic.ilogic \
       OCanren.Std.List.injected)OCanren.Std.List.t OCanren__.Logic.ilogic"
    , "OlegTerm" )
  ; ( "(int OCanren.ilogic, int OCanren.ilogic \
       OCanren.Std.List.injected)OCanren.Std.List.t OCanren__.Logic.ilogic"
    , "OlegTerm" )
  ]]

let conso1 : int ilogic Std.List.injected -> goal =
  fun xs -> fresh (h tl) (xs === Std.List.cons h tl)
;;

let nilo1 : int ilogic Std.List.injected -> goal = fun xs -> xs === Std.List.nil ()
(* let nilo2 : int ilogic Std.List.injected -> goal = fun xs -> xs =/= Std.List.cons __ __ *)

module type CT = sig
  val decl_by_id : (int ilogic -> OCanren.goal) -> decl_injected -> OCanren.goal

  val get_superclass
    :  (int ilogic -> OCanren.goal)
    -> (int ilogic -> OCanren.goal)
    -> jtype_injected Std.Option.injected
    -> OCanren.goal

  val object_t : jtype_injected -> OCanren.goal
  val cloneable_t : jtype_injected -> OCanren.goal
  val serializable_t : jtype_injected -> OCanren.goal
  val new_var : (unit OCanren.ilogic -> OCanren.goal) -> int ilogic -> OCanren.goal
end
