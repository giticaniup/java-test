//package com.kode.test.solr;
//
//import org.apache.solr.client.solrj.SolrClient;
//import org.apache.solr.client.solrj.SolrQuery;
//import org.apache.solr.client.solrj.SolrServerException;
//import org.apache.solr.client.solrj.impl.HttpSolrClient;
//import org.apache.solr.client.solrj.response.QueryResponse;
//import org.apache.solr.common.SolrDocumentList;
//import org.apache.solr.common.SolrInputDocument;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class AtomicIntegerFieldUpdaterDemo {
//    //solr 服务器地址
//    public static final String solrServerUrl = "http://localhost:8080/solr";
//    //solrhome下的core
//    public static final String solrCroeHome = "goodtime";
//    //待索引、查询字段
//    public static String[] docs = {"Solr是一个独立的企业级搜索应用服务器",
//            "它对外提供类似于Web-service的API接口",
//            "用户可以通过http请求",
//            "向搜索引擎服务器提交一定格式的XML文件生成索引",
//            "也可以通过Http Get操作提出查找请求",
//            "并得到XML格式的返回结果"};
//
//    public static void main(String[] args) {
//        SolrClient client = getSolrClient();
//        int i = 0;
//        List<SolrInputDocument> solrDocs = new ArrayList<>();
//        for (String content : docs) {
//            SolrInputDocument doc = new SolrInputDocument();
//            doc.addField("id", i++);
//            doc.addField("suggestion", content);
//            solrDocs.add(doc);
//        }
//        try {
//            client.add(solrDocs);
//            client.commit();
//        } catch (SolrServerException | IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public static SolrClient getSolrClient() {
//        return new HttpSolrClient.Builder(solrServerUrl+"/"+solrCroeHome).build();
//    }
//
//    @org.junit.AtomicIntegerFieldUpdaterDemo
//    public void perfromingQuery(){
//        long beginTime = System.currentTimeMillis();
//        SolrClient client = getSolrClient();
//        SolrQuery solrQuery = new SolrQuery();
//        solrQuery.setRequestHandler("/select");
//        solrQuery.setQuery("*:*");
//
//        //设置域
//        solrQuery.setFields("name");
//        //solrQuery.setHighlight(true);
//        //设置过滤条件
//        solrQuery.setFilterQueries("name:solr");
//        try {
//            QueryResponse response = client.query(solrQuery);
//            SolrDocumentList list = response.getResults();
//            System.out.println(list);
//        } catch (SolrServerException | IOException e) {
//            e.printStackTrace();
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime-beginTime);
//    }
//
//    @org.junit.AtomicIntegerFieldUpdaterDemo
//    public void testSolrServer(){
//
//    }
//
//}
