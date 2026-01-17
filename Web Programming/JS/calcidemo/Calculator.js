        str=""
        calcisymbol="+-*/"
        inp=document.getElementById("inp")


        function submitValue(value)
        {
             inputstring=inp.value
             len=inputstring.length

            if(calcisymbol.includes(inputstring.charAt(len-1))&calcisymbol.includes(value))
        {
            console.log(inputstring.charAt(len-1))
            console.log(str)
        }
        else
        {
            console.log(value)
            console.log(str)
            str=str+value
            inp.value=str
        }
            
        }

        function evaluate1()
        {
            if(calcisymbol.includes(inp.value.charAt(inp.value.length-1)))
            {
                console.log("Invalid")
            }
            else
            {
            res=eval(inp.value)
            str=res
            document.getElementById("inp").value=str

            }    
            
        }
function clearAll()
{
    str = ""
    inp.value = ""
}

function clearOne()
{
    str = str.slice(0, -1)
    inp.value = str
}


