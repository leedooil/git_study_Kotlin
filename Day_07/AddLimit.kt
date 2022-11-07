fun <T:Number> addLimits(a:T,b:T,op:(T,T)->T):T{
    return op(a,b)
}

//val result = addLimits("abc","def",{a,b->a+b})