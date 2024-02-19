package yava.bad.kotlin.good.lol.nullabledtofield

/**
 * Here we have all the benefits of the java case, without any extra work.
 * The nullable is part of the language and a generator can use that to infer the TS nullability.
 */
data class Fix1(val stuff: String?)
