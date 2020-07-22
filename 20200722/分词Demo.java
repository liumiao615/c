package lab;

import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.NlpAnalysis;

import java.util.List;

public class 分词Demo {
    public static void main(String[] args) {
        String S = "靡不有初,鲜克有终";
        List<Term> termList = NlpAnalysis.parse(S).getTerms();
        for(Term term:termList){
            System.out.println(term.getNatureStr() + ":" + term.getName());
        }
    }
}
