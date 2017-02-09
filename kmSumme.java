int kmSumme (Baum b)
{
	int summe;
	if(b.istLeer())	{
		summe=0;
	}
	else {
		summe=
		    kmSumme(b.linkerTeilbaum())
	          + kmSumme(b.rechterTeilbaum())
		  + b.inhaltGeben().km;
	}
	return summe;
}
