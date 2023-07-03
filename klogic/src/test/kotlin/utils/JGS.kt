// There are 1 relations
































































fun capture_conversion(<-<: (jtype_injected -> Option.HO.goal) ->(jtype_injected -> Option.HO.goal) ->GT.bool Option.HO.ilogic ->Option.HO.State.t -> Option.HO.State.t OCanren.Stream.t,
id: GT.int Option.HO.ilogic -> OCanren.goal,
targs: jtype_injected targ_injected Option.HO.Std.List.injected -> Option.HO.goal,
q205: jtype_injected targ_injected Option.HO.Std.List.injected Option.HO.optionOption.HO.ilogic): Goal =
  { st: State ->
  Option.HO.pause(/* ERROR ? */{|  fun () ->
                                     let q206 = State.fresh st in
                                     bind ((targs q206) st)
                                       (let params q98 st =
                                          pause
                                            (fun () ->
                                               let q99 = State.fresh st in
                                               let q100 = State.fresh st in
                                               let q101 = State.fresh st in
                                               let q102 = State.fresh st in
                                               bind
                                                 ((CT.HO.decl_by_id id q99)
                                                    st)
                                                 (fun st ->
                                                    pause
                                                      (fun () ->
                                                         let st =
                                                           State.new_scope st in
                                                         mplus
                                                           ((q99 ===
                                                               (!!
                                                                  (C
                                                                    (ctor_cdecl
                                                                    q98 q100
                                                                    q101))))
                                                              st)
                                                           (pause
                                                              (fun () ->
                                                                 (q99 ===
                                                                    (
                                                                    !!
                                                                    (I
                                                                    (ctor_idecl
                                                                    q98 q102))))
                                                                   st))))) in
                                        let raw =
                                          List.HO.mapi
                                            (fun i ->
                                               fun q107 ->
                                                 fun q133 ->
                                                   fun st ->
                                                     pause
                                                       (fun () ->
                                                          let q134 =
                                                            State.fresh st in
                                                          let q110 =
                                                            State.fresh st in
                                                          bind
                                                            (bind
                                                               ((i q134) st)
                                                               (q107 q110))
                                                            (fun st ->
                                                               pause
                                                                 (fun () ->
                                                                    let st =
                                                                    State.new_scope
                                                                    st in
                                                                    mplus
                                                                    ((fun st
                                                                    ->
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    let t =
                                                                    State.fresh
                                                                    st in
                                                                    bind
                                                                    ((q110
                                                                    ===
                                                                    (!!
                                                                    (Type t)))
                                                                    st)
                                                                    (q133 ===
                                                                    (!!
                                                                    (CC_type
                                                                    t))))) st)
                                                                    (pause
                                                                    (fun ()
                                                                    ->
                                                                    mplus
                                                                    ((fun st
                                                                    ->
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    let q114
                                                                    =
                                                                    State.fresh
                                                                    st in
                                                                    let q117
                                                                    =
                                                                    State.fresh
                                                                    st in
                                                                    bind
                                                                    (bind
                                                                    (bind
                                                                    ((q110
                                                                    ===
                                                                    (!!
                                                                    (Wildcard
                                                                    (!! None))))
                                                                    st)
                                                                    (q133 ===
                                                                    (!!
                                                                    (CC_var
                                                                    (q114,
                                                                    q134,
                                                                    (!!
                                                                    (CC_subst
                                                                    q117)),
                                                                    (!!
                                                                    (Some
                                                                    (!! Null))))))))
                                                                    (CT.HO.new_var
                                                                    ((===) (
                                                                    !! ()))
                                                                    q114))
                                                                    (List.HO.nth
                                                                    params
                                                                    ((===) q134)
                                                                    q117)))
                                                                    st)
                                                                    (pause
                                                                    (fun ()
                                                                    ->
                                                                    mplus
                                                                    ((fun st
                                                                    ->
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    let t =
                                                                    State.fresh
                                                                    st in
                                                                    let q119
                                                                    =
                                                                    State.fresh
                                                                    st in
                                                                    let q122
                                                                    =
                                                                    State.fresh
                                                                    st in
                                                                    bind
                                                                    (bind
                                                                    (bind
                                                                    ((q110
                                                                    ===
                                                                    (!!
                                                                    (Wildcard
                                                                    (!!
                                                                    (Some
                                                                    (Std.pair
                                                                    (!! Super)
                                                                    t))))))
                                                                    st)
                                                                    (q133 ===
                                                                    (!!
                                                                    (CC_var
                                                                    (q119,
                                                                    q134,
                                                                    (!!
                                                                    (CC_subst
                                                                    q122)),
                                                                    (!!
                                                                    (Some t)))))))
                                                                    (CT.HO.new_var
                                                                    ((===) (
                                                                    !! ()))
                                                                    q119))
                                                                    (List.HO.nth
                                                                    params
                                                                    ((===) q134)
                                                                    q122)))
                                                                    st)
                                                                    (pause
                                                                    (fun ()
                                                                    ->
                                                                    (fun st
                                                                    ->
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    let t =
                                                                    State.fresh
                                                                    st in
                                                                    let q126
                                                                    =
                                                                    State.fresh
                                                                    st in
                                                                    let q130
                                                                    =
                                                                    State.fresh
                                                                    st in
                                                                    bind
                                                                    (bind
                                                                    (bind
                                                                    ((q110
                                                                    ===
                                                                    (!!
                                                                    (Wildcard
                                                                    (!!
                                                                    (Some
                                                                    (Std.pair
                                                                    (!!
                                                                    Extends)
                                                                    t))))))
                                                                    st)
                                                                    (q133 ===
                                                                    (!!
                                                                    (CC_var
                                                                    (q126,
                                                                    q134,
                                                                    (!!
                                                                    (CC_inter
                                                                    (t, q130))),
                                                                    (!!
                                                                    (Some
                                                                    (!! Null))))))))
                                                                    (CT.HO.new_var
                                                                    ((===) (
                                                                    !! ()))
                                                                    q126))
                                                                    (List.HO.nth
                                                                    params
                                                                    ((===) q134)
                                                                    q130)))
                                                                    st))))))))))
                                            ((===) q206) in
                                        let subst =
                                          List.HO.map
                                            (fun q136 ->
                                               fun q137 ->
                                                 fun st ->
                                                   pause
                                                     (fun () ->
                                                        let q138 =
                                                          State.fresh st in
                                                        bind ((q136 q138) st)
                                                          (fun st ->
                                                             pause
                                                               (fun () ->
                                                                  let st =
                                                                    State.new_scope
                                                                    st in
                                                                  mplus
                                                                    (
                                                                    (fun st
                                                                    ->
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    let t =
                                                                    State.fresh
                                                                    st in
                                                                    bind
                                                                    ((q138
                                                                    ===
                                                                    (!!
                                                                    (CC_type
                                                                    t))) st)
                                                                    (q137 ===
                                                                    (!!
                                                                    (Type t)))))
                                                                    st)
                                                                    (
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    (fun st
                                                                    ->
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    let id =
                                                                    State.fresh
                                                                    st in
                                                                    let i =
                                                                    State.fresh
                                                                    st in
                                                                    let q142
                                                                    =
                                                                    State.fresh
                                                                    st in
                                                                    let q143
                                                                    =
                                                                    State.fresh
                                                                    st in
                                                                    bind
                                                                    ((q138
                                                                    ===
                                                                    (!!
                                                                    (CC_var
                                                                    (id, i,
                                                                    q142,
                                                                    q143))))
                                                                    st)
                                                                    (q137 ===
                                                                    (!!
                                                                    (Type
                                                                    (var id i
                                                                    (!! Null)
                                                                    (!! None)))))))
                                                                    st))))))
                                            raw in
                                        let targs =
                                          List.HO.map
                                            (fun q151 ->
                                               fun q152 ->
                                                 fun st ->
                                                   pause
                                                     (fun () ->
                                                        let q153 =
                                                          State.fresh st in
                                                        bind ((q151 q153) st)
                                                          (fun st ->
                                                             pause
                                                               (fun () ->
                                                                  let st =
                                                                    State.new_scope
                                                                    st in
                                                                  mplus
                                                                    (
                                                                    (fun st
                                                                    ->
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    let t =
                                                                    State.fresh
                                                                    st in
                                                                    let q154
                                                                    =
                                                                    State.fresh
                                                                    st in
                                                                    bind
                                                                    (bind
                                                                    ((q153
                                                                    ===
                                                                    (!!
                                                                    (CC_type
                                                                    t))) st)
                                                                    (q152 ===
                                                                    (!!
                                                                    (Type
                                                                    q154))))
                                                                    (substitute_typ
                                                                    subst
                                                                    ((===) t)
                                                                    q154)))
                                                                    st)
                                                                    (
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    mplus
                                                                    ((fun st
                                                                    ->
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    let id =
                                                                    State.fresh
                                                                    st in
                                                                    let i =
                                                                    State.fresh
                                                                    st in
                                                                    let p =
                                                                    State.fresh
                                                                    st in
                                                                    let lwb =
                                                                    State.fresh
                                                                    st in
                                                                    let q159
                                                                    =
                                                                    State.fresh
                                                                    st in
                                                                    bind
                                                                    (bind
                                                                    ((q153
                                                                    ===
                                                                    (!!
                                                                    (CC_var
                                                                    (id, i,
                                                                    (!!
                                                                    (CC_subst
                                                                    p)), lwb))))
                                                                    st)
                                                                    (q152 ===
                                                                    (!!
                                                                    (Type
                                                                    (var id i
                                                                    q159 lwb)))))
                                                                    (substitute_typ
                                                                    subst
                                                                    ((===) p)
                                                                    q159)))
                                                                    st)
                                                                    (pause
                                                                    (fun ()
                                                                    ->
                                                                    (fun st
                                                                    ->
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    let id =
                                                                    State.fresh
                                                                    st in
                                                                    let i =
                                                                    State.fresh
                                                                    st in
                                                                    let t =
                                                                    State.fresh
                                                                    st in
                                                                    let p =
                                                                    State.fresh
                                                                    st in
                                                                    let lwb =
                                                                    State.fresh
                                                                    st in
                                                                    let q168
                                                                    =
                                                                    State.fresh
                                                                    st in
                                                                    let q170
                                                                    =
                                                                    State.fresh
                                                                    st in
                                                                    bind
                                                                    (bind
                                                                    (bind
                                                                    ((q153
                                                                    ===
                                                                    (!!
                                                                    (CC_var
                                                                    (id, i,
                                                                    (!!
                                                                    (CC_inter
                                                                    (t, p))),
                                                                    lwb))))
                                                                    st)
                                                                    (q152 ===
                                                                    (!!
                                                                    (Type
                                                                    (var id i
                                                                    q168 lwb)))))
                                                                    (substitute_typ
                                                                    subst
                                                                    ((===) p)
                                                                    q170))
                                                                    (fun st
                                                                    ->
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    let st =
                                                                    State.new_scope
                                                                    st in
                                                                    mplus
                                                                    ((fun st
                                                                    ->
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    let ts =
                                                                    State.fresh
                                                                    st in
                                                                    bind
                                                                    ((q170
                                                                    ===
                                                                    (!!
                                                                    (Intersect
                                                                    ts))) st)
                                                                    (q168 ===
                                                                    (!!
                                                                    (Intersect
                                                                    (Std.(%)
                                                                    t ts))))))
                                                                    st)
                                                                    (pause
                                                                    (fun ()
                                                                    ->
                                                                    (fun st
                                                                    ->
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    bind
                                                                    ((q168
                                                                    ===
                                                                    (!!
                                                                    (Intersect
                                                                    (Std.list
                                                                    Fun.id
                                                                    [t; q170]))))
                                                                    st)
                                                                    (wc
                                                                    (fun
                                                                    __JGS/JGS.ml_c54
                                                                    ->
                                                                    q170 =/=
                                                                    (!!
                                                                    (Intersect
                                                                    __JGS/JGS.ml_c54))))))
                                                                    st))))))
                                                                    st))))))))
                                            raw in
                                        fun st ->
                                          pause
                                            (fun () ->
                                               let q186 = State.fresh st in
                                               bind
                                                 ((List.HO.for_all
                                                     (fun q191 ->
                                                        fun q192 ->
                                                          fun st ->
                                                            pause
                                                              (fun () ->
                                                                 let q193 =
                                                                   State.fresh
                                                                    st in
                                                                 bind
                                                                   ((q191
                                                                    q193) st)
                                                                   (fun st ->
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    let st =
                                                                    State.new_scope
                                                                    st in
                                                                    mplus
                                                                    ((fun st
                                                                    ->
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    let q194
                                                                    =
                                                                    State.fresh
                                                                    st in
                                                                    let q195
                                                                    =
                                                                    State.fresh
                                                                    st in
                                                                    let upb =
                                                                    State.fresh
                                                                    st in
                                                                    let lwb =
                                                                    State.fresh
                                                                    st in
                                                                    bind
                                                                    ((q193
                                                                    ===
                                                                    (!!
                                                                    (Type
                                                                    (var q194
                                                                    q195 upb
                                                                    (!!
                                                                    (Some lwb))))))
                                                                    st)
                                                                    ((<-<) (
                                                                    (===) lwb)
                                                                    ((===) upb)
                                                                    q192)))
                                                                    st)
                                                                    (pause
                                                                    (fun ()
                                                                    ->
                                                                    (fun st
                                                                    ->
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    bind
                                                                    ((q192
                                                                    ===
                                                                    (!! true))
                                                                    st)
                                                                    (wc
                                                                    (fun
                                                                    __JGS/JGS.ml_c48
                                                                    ->
                                                                    wc
                                                                    (fun
                                                                    __JGS/JGS.ml_c51
                                                                    ->
                                                                    wc
                                                                    (fun
                                                                    __JGS/JGS.ml_c54
                                                                    ->
                                                                    wc
                                                                    (fun
                                                                    __JGS/JGS.ml_c65
                                                                    ->
                                                                    q193 =/=
                                                                    (!!
                                                                    (Type
                                                                    (var
                                                                    __JGS/JGS.ml_c48
                                                                    __JGS/JGS.ml_c51
                                                                    __JGS/JGS.ml_c54
                                                                    (!!
                                                                    (Some
                                                                    __JGS/JGS.ml_c65))))))))))))
                                                                    st))))))
                                                     targs q186) st)
                                                 (fun st ->
                                                    pause
                                                      (fun () ->
                                                         let st =
                                                           State.new_scope st in
                                                         mplus
                                                           ((fun st ->
                                                               pause
                                                                 (fun () ->
                                                                    let q189
                                                                    =
                                                                    State.fresh
                                                                    st in
                                                                    bind
                                                                    (bind
                                                                    ((q186
                                                                    ===
                                                                    (!! true))
                                                                    st)
                                                                    (q205 ===
                                                                    (!!
                                                                    (Some
                                                                    q189))))
                                                                    (targs
                                                                    q189)))
                                                              st)
                                                           (pause
                                                              (fun () ->
                                                                 (fun st ->
                                                                    pause
                                                                    (fun ()
                                                                    ->
                                                                    bind
                                                                    ((q186
                                                                    ===
                                                                    (!! false))
                                                                    st)
                                                                    (q205 ===
                                                                    (!! None))))
                                                                   st)))))) |})
  }






