<%--
  Created by IntelliJ IDEA.
  User: Angel
  Date: 2017/4/15
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单表</title>
</head>
<body>
<div class="page-content-col">
    <!-- BEGIN PAGE BASE CONTENT -->


    <div class="row">
        <div class="col-md-12">

            <!-- Begin: life time stats -->
            <div class="portlet light portlet-fit portlet-datatable bordered">

                <div class="portlet-body">
                    <div class="table-container">

                        <table class="table table-striped table-bordered table-hover table-checkable" id="datatable_orders">
                            <thead>
                            <tr role="row" class="heading">
                                <th width="2%">
                                    <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                        <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                        <span></span>
                                    </label>
                                </th>
                                <th width="5%"> 订单号&nbsp; </th>
                                <th width="15%"> 购买日期&nbsp; </th>
                                <th width="10%"> 客户 </th>
                                <th width="10%"> 手机号&nbsp; </th>
                                <th width="10%"> 产品ID&nbsp; </th>
                                <th width="10%"> 销售人员&nbsp; </th>
                                <th width="10%"> 是否结款 </th>
                                <th width="10%"> 是否失效 </th>
                                <th width="10%"> 操作 </th>
                            </tr>
                            <tr role="row" class="filter">
                                <td> </td>
                                <td>
                                    <input type="text" class="form-control form-filter input-sm" name="order_id"> </td>
                                <td>
                                    <div class="input-group date date-picker margin-bottom-5" data-date-format="dd/mm/yyyy">
                                        <input type="text" class="form-control form-filter input-sm" readonly name="order_date_from" placeholder="From">
                                        <span class="input-group-btn">
                                                                            <button class="btn btn-sm default" type="button">
                                                                                <i class="fa fa-calendar"></i>
                                                                            </button>
                                                                        </span>

                                        <input type="text" class="form-control form-filter input-sm" readonly name="order_date_to" placeholder="To">
                                        <span class="input-group-btn">
                                                                            <button class="btn btn-sm default" type="button">
                                                                                <i class="fa fa-calendar"></i>
                                                                            </button>
                                                                        </span>
                                    </div>
                                    <div class="input-append date form_datetime">
                                        <input size="16" type="text" value="" readonly>
                                        <span class="add-on"><i class="fa fa-calendar"></i></span>
                                    </div>
                                </td>
                                <td>
                                    <input type="text" class="form-control form-filter input-sm" name="order_customer_name"> </td>
                                <td>
                                    <input type="text" class="form-control form-filter input-sm" name="order_ship_to"> </td>
                                <td>

                                    <input type="text" class="form-control form-filter input-sm" name="order_base_price_to" /> </td>
                                <td>

                                    <input type="text" class="form-control form-filter input-sm" name="order_purchase_price_to"  /> </td>
                                <td>
                                    <select name="order_status" class="form-control form-filter input-sm">
                                        <option value="">是</option>
                                        <option value="pending">否</option>

                                    </select>
                                </td>
                                <td>
                                    <select name="order_status" class="form-control form-filter input-sm">
                                        <option value="">是</option>
                                        <option value="pending">否</option>

                                    </select>
                                </td>
                                <td>
                                    <div class="margin-bottom-5">
                                        <button class="btn btn-sm btn-success filter-submit margin-bottom">
                                            <i class="fa fa-search"></i> Search</button>

                                    <button class="btn btn-sm btn-default filter-cancel">
                                        <i class="fa fa-times"></i> Reset</button>
                                    </div>
                                </td>
                            </tr>
                            </thead>
                            <tbody> </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <!-- End: life time stats -->
        </div>
    </div>



    <div class="row">
        <div class="col-md-12">

            <div class="portlet light bordered">
                <div class="portlet-title">
                    <div class="caption font-dark">
                        <i class="icon-settings font-dark"></i>
                        <span class="caption-subject bold uppercase">Default Scroller</span>
                    </div>
                    <div class="tools"> </div>
                </div>
                <div class="portlet-body">
                    <table class="table table-striped table-bordered table-hover order-column" id="sample_1">
                        <thead>
                        <tr>
                            <th>First&nbsp;name</th>
                            <th>Lastname</th>
                            <th>Position</th>
                            <th>Office</th>
                            <th>Age</th>
                            <th>Start&nbsp;date</th>
                            <th>Salary</th>
                            <th>Extn.</th>
                            <th>E-mail</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>Tiger</td>
                            <td>Nixon</td>
                            <td>System Architect</td>
                            <td>Edinburgh</td>
                            <td>61</td>
                            <td>2011/04/25</td>
                            <td>$320,800</td>
                            <td>5421</td>
                            <td>t.nixon@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Garrett</td>
                            <td>Winters</td>
                            <td>Accountant</td>
                            <td>Tokyo</td>
                            <td>63</td>
                            <td>2011/07/25</td>
                            <td>$170,750</td>
                            <td>8422</td>
                            <td>g.winters@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Ashton</td>
                            <td>Cox</td>
                            <td>Junior Technical Author</td>
                            <td>San Francisco</td>
                            <td>66</td>
                            <td>2009/01/12</td>
                            <td>$86,000</td>
                            <td>1562</td>
                            <td>a.cox@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Cedric</td>
                            <td>Kelly</td>
                            <td>Senior Javascript Developer</td>
                            <td>Edinburgh</td>
                            <td>22</td>
                            <td>2012/03/29</td>
                            <td>$433,060</td>
                            <td>6224</td>
                            <td>c.kelly@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Airi</td>
                            <td>Satou</td>
                            <td>Accountant</td>
                            <td>Tokyo</td>
                            <td>33</td>
                            <td>2008/11/28</td>
                            <td>$162,700</td>
                            <td>5407</td>
                            <td>a.satou@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Brielle</td>
                            <td>Williamson</td>
                            <td>Integration Specialist</td>
                            <td>New York</td>
                            <td>61</td>
                            <td>2012/12/02</td>
                            <td>$372,000</td>
                            <td>4804</td>
                            <td>b.williamson@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Herrod</td>
                            <td>Chandler</td>
                            <td>Sales Assistant</td>
                            <td>San Francisco</td>
                            <td>59</td>
                            <td>2012/08/06</td>
                            <td>$137,500</td>
                            <td>9608</td>
                            <td>h.chandler@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Rhona</td>
                            <td>Davidson</td>
                            <td>Integration Specialist</td>
                            <td>Tokyo</td>
                            <td>55</td>
                            <td>2010/10/14</td>
                            <td>$327,900</td>
                            <td>6200</td>
                            <td>r.davidson@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Colleen</td>
                            <td>Hurst</td>
                            <td>Javascript Developer</td>
                            <td>San Francisco</td>
                            <td>39</td>
                            <td>2009/09/15</td>
                            <td>$205,500</td>
                            <td>2360</td>
                            <td>c.hurst@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Sonya</td>
                            <td>Frost</td>
                            <td>Software Engineer</td>
                            <td>Edinburgh</td>
                            <td>23</td>
                            <td>2008/12/13</td>
                            <td>$103,600</td>
                            <td>1667</td>
                            <td>s.frost@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Jena</td>
                            <td>Gaines</td>
                            <td>Office Manager</td>
                            <td>London</td>
                            <td>30</td>
                            <td>2008/12/19</td>
                            <td>$90,560</td>
                            <td>3814</td>
                            <td>j.gaines@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Quinn</td>
                            <td>Flynn</td>
                            <td>Support Lead</td>
                            <td>Edinburgh</td>
                            <td>22</td>
                            <td>2013/03/03</td>
                            <td>$342,000</td>
                            <td>9497</td>
                            <td>q.flynn@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Charde</td>
                            <td>Marshall</td>
                            <td>Regional Director</td>
                            <td>San Francisco</td>
                            <td>36</td>
                            <td>2008/10/16</td>
                            <td>$470,600</td>
                            <td>6741</td>
                            <td>c.marshall@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Haley</td>
                            <td>Kennedy</td>
                            <td>Senior Marketing Designer</td>
                            <td>London</td>
                            <td>43</td>
                            <td>2012/12/18</td>
                            <td>$313,500</td>
                            <td>3597</td>
                            <td>h.kennedy@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Tatyana</td>
                            <td>Fitzpatrick</td>
                            <td>Regional Director</td>
                            <td>London</td>
                            <td>19</td>
                            <td>2010/03/17</td>
                            <td>$385,750</td>
                            <td>1965</td>
                            <td>t.fitzpatrick@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Michael</td>
                            <td>Silva</td>
                            <td>Marketing Designer</td>
                            <td>London</td>
                            <td>66</td>
                            <td>2012/11/27</td>
                            <td>$198,500</td>
                            <td>1581</td>
                            <td>m.silva@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Paul</td>
                            <td>Byrd</td>
                            <td>Chief Financial Officer (CFO)</td>
                            <td>New York</td>
                            <td>64</td>
                            <td>2010/06/09</td>
                            <td>$725,000</td>
                            <td>3059</td>
                            <td>p.byrd@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Gloria</td>
                            <td>Little</td>
                            <td>Systems Administrator</td>
                            <td>New York</td>
                            <td>59</td>
                            <td>2009/04/10</td>
                            <td>$237,500</td>
                            <td>1721</td>
                            <td>g.little@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Bradley</td>
                            <td>Greer</td>
                            <td>Software Engineer</td>
                            <td>London</td>
                            <td>41</td>
                            <td>2012/10/13</td>
                            <td>$132,000</td>
                            <td>2558</td>
                            <td>b.greer@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Dai</td>
                            <td>Rios</td>
                            <td>Personnel Lead</td>
                            <td>Edinburgh</td>
                            <td>35</td>
                            <td>2012/09/26</td>
                            <td>$217,500</td>
                            <td>2290</td>
                            <td>d.rios@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Jenette</td>
                            <td>Caldwell</td>
                            <td>Development Lead</td>
                            <td>New York</td>
                            <td>30</td>
                            <td>2011/09/03</td>
                            <td>$345,000</td>
                            <td>1937</td>
                            <td>j.caldwell@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Yuri</td>
                            <td>Berry</td>
                            <td>Chief Marketing Officer (CMO)</td>
                            <td>New York</td>
                            <td>40</td>
                            <td>2009/06/25</td>
                            <td>$675,000</td>
                            <td>6154</td>
                            <td>y.berry@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Caesar</td>
                            <td>Vance</td>
                            <td>Pre-Sales Support</td>
                            <td>New York</td>
                            <td>21</td>
                            <td>2011/12/12</td>
                            <td>$106,450</td>
                            <td>8330</td>
                            <td>c.vance@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Doris</td>
                            <td>Wilder</td>
                            <td>Sales Assistant</td>
                            <td>Sidney</td>
                            <td>23</td>
                            <td>2010/09/20</td>
                            <td>$85,600</td>
                            <td>3023</td>
                            <td>d.wilder@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Angelica</td>
                            <td>Ramos</td>
                            <td>Chief Executive Officer (CEO)</td>
                            <td>London</td>
                            <td>47</td>
                            <td>2009/10/09</td>
                            <td>$1,200,000</td>
                            <td>5797</td>
                            <td>a.ramos@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Gavin</td>
                            <td>Joyce</td>
                            <td>Developer</td>
                            <td>Edinburgh</td>
                            <td>42</td>
                            <td>2010/12/22</td>
                            <td>$92,575</td>
                            <td>8822</td>
                            <td>g.joyce@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Jennifer</td>
                            <td>Chang</td>
                            <td>Regional Director</td>
                            <td>Singapore</td>
                            <td>28</td>
                            <td>2010/11/14</td>
                            <td>$357,650</td>
                            <td>9239</td>
                            <td>j.chang@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Brenden</td>
                            <td>Wagner</td>
                            <td>Software Engineer</td>
                            <td>San Francisco</td>
                            <td>28</td>
                            <td>2011/06/07</td>
                            <td>$206,850</td>
                            <td>1314</td>
                            <td>b.wagner@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Fiona</td>
                            <td>Green</td>
                            <td>Chief Operating Officer (COO)</td>
                            <td>San Francisco</td>
                            <td>48</td>
                            <td>2010/03/11</td>
                            <td>$850,000</td>
                            <td>2947</td>
                            <td>f.green@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Shou</td>
                            <td>Itou</td>
                            <td>Regional Marketing</td>
                            <td>Tokyo</td>
                            <td>20</td>
                            <td>2011/08/14</td>
                            <td>$163,000</td>
                            <td>8899</td>
                            <td>s.itou@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Michelle</td>
                            <td>House</td>
                            <td>Integration Specialist</td>
                            <td>Sidney</td>
                            <td>37</td>
                            <td>2011/06/02</td>
                            <td>$95,400</td>
                            <td>2769</td>
                            <td>m.house@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Suki</td>
                            <td>Burks</td>
                            <td>Developer</td>
                            <td>London</td>
                            <td>53</td>
                            <td>2009/10/22</td>
                            <td>$114,500</td>
                            <td>6832</td>
                            <td>s.burks@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Prescott</td>
                            <td>Bartlett</td>
                            <td>Technical Author</td>
                            <td>London</td>
                            <td>27</td>
                            <td>2011/05/07</td>
                            <td>$145,000</td>
                            <td>3606</td>
                            <td>p.bartlett@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Gavin</td>
                            <td>Cortez</td>
                            <td>Team Leader</td>
                            <td>San Francisco</td>
                            <td>22</td>
                            <td>2008/10/26</td>
                            <td>$235,500</td>
                            <td>2860</td>
                            <td>g.cortez@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Martena</td>
                            <td>Mccray</td>
                            <td>Post-Sales support</td>
                            <td>Edinburgh</td>
                            <td>46</td>
                            <td>2011/03/09</td>
                            <td>$324,050</td>
                            <td>8240</td>
                            <td>m.mccray@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Unity</td>
                            <td>Butler</td>
                            <td>Marketing Designer</td>
                            <td>San Francisco</td>
                            <td>47</td>
                            <td>2009/12/09</td>
                            <td>$85,675</td>
                            <td>5384</td>
                            <td>u.butler@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Howard</td>
                            <td>Hatfield</td>
                            <td>Office Manager</td>
                            <td>San Francisco</td>
                            <td>51</td>
                            <td>2008/12/16</td>
                            <td>$164,500</td>
                            <td>7031</td>
                            <td>h.hatfield@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Hope</td>
                            <td>Fuentes</td>
                            <td>Secretary</td>
                            <td>San Francisco</td>
                            <td>41</td>
                            <td>2010/02/12</td>
                            <td>$109,850</td>
                            <td>6318</td>
                            <td>h.fuentes@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Vivian</td>
                            <td>Harrell</td>
                            <td>Financial Controller</td>
                            <td>San Francisco</td>
                            <td>62</td>
                            <td>2009/02/14</td>
                            <td>$452,500</td>
                            <td>9422</td>
                            <td>v.harrell@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Timothy</td>
                            <td>Mooney</td>
                            <td>Office Manager</td>
                            <td>London</td>
                            <td>37</td>
                            <td>2008/12/11</td>
                            <td>$136,200</td>
                            <td>7580</td>
                            <td>t.mooney@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Jackson</td>
                            <td>Bradshaw</td>
                            <td>Director</td>
                            <td>New York</td>
                            <td>65</td>
                            <td>2008/09/26</td>
                            <td>$645,750</td>
                            <td>1042</td>
                            <td>j.bradshaw@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Olivia</td>
                            <td>Liang</td>
                            <td>Support Engineer</td>
                            <td>Singapore</td>
                            <td>64</td>
                            <td>2011/02/03</td>
                            <td>$234,500</td>
                            <td>2120</td>
                            <td>o.liang@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Bruno</td>
                            <td>Nash</td>
                            <td>Software Engineer</td>
                            <td>London</td>
                            <td>38</td>
                            <td>2011/05/03</td>
                            <td>$163,500</td>
                            <td>6222</td>
                            <td>b.nash@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Sakura</td>
                            <td>Yamamoto</td>
                            <td>Support Engineer</td>
                            <td>Tokyo</td>
                            <td>37</td>
                            <td>2009/08/19</td>
                            <td>$139,575</td>
                            <td>9383</td>
                            <td>s.yamamoto@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Thor</td>
                            <td>Walton</td>
                            <td>Developer</td>
                            <td>New York</td>
                            <td>61</td>
                            <td>2013/08/11</td>
                            <td>$98,540</td>
                            <td>8327</td>
                            <td>t.walton@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Finn</td>
                            <td>Camacho</td>
                            <td>Support Engineer</td>
                            <td>San Francisco</td>
                            <td>47</td>
                            <td>2009/07/07</td>
                            <td>$87,500</td>
                            <td>2927</td>
                            <td>f.camacho@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Serge</td>
                            <td>Baldwin</td>
                            <td>Data Coordinator</td>
                            <td>Singapore</td>
                            <td>64</td>
                            <td>2012/04/09</td>
                            <td>$138,575</td>
                            <td>8352</td>
                            <td>s.baldwin@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Zenaida</td>
                            <td>Frank</td>
                            <td>Software Engineer</td>
                            <td>New York</td>
                            <td>63</td>
                            <td>2010/01/04</td>
                            <td>$125,250</td>
                            <td>7439</td>
                            <td>z.frank@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Zorita</td>
                            <td>Serrano</td>
                            <td>Software Engineer</td>
                            <td>San Francisco</td>
                            <td>56</td>
                            <td>2012/06/01</td>
                            <td>$115,000</td>
                            <td>4389</td>
                            <td>z.serrano@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Jennifer</td>
                            <td>Acosta</td>
                            <td>Junior Javascript Developer</td>
                            <td>Edinburgh</td>
                            <td>43</td>
                            <td>2013/02/01</td>
                            <td>$75,650</td>
                            <td>3431</td>
                            <td>j.acosta@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Cara</td>
                            <td>Stevens</td>
                            <td>Sales Assistant</td>
                            <td>New York</td>
                            <td>46</td>
                            <td>2011/12/06</td>
                            <td>$145,600</td>
                            <td>3990</td>
                            <td>c.stevens@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Hermione</td>
                            <td>Butler</td>
                            <td>Regional Director</td>
                            <td>London</td>
                            <td>47</td>
                            <td>2011/03/21</td>
                            <td>$356,250</td>
                            <td>1016</td>
                            <td>h.butler@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Lael</td>
                            <td>Greer</td>
                            <td>Systems Administrator</td>
                            <td>London</td>
                            <td>21</td>
                            <td>2009/02/27</td>
                            <td>$103,500</td>
                            <td>6733</td>
                            <td>l.greer@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Jonas</td>
                            <td>Alexander</td>
                            <td>Developer</td>
                            <td>San Francisco</td>
                            <td>30</td>
                            <td>2010/07/14</td>
                            <td>$86,500</td>
                            <td>8196</td>
                            <td>j.alexander@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Shad</td>
                            <td>Decker</td>
                            <td>Regional Director</td>
                            <td>Edinburgh</td>
                            <td>51</td>
                            <td>2008/11/13</td>
                            <td>$183,000</td>
                            <td>6373</td>
                            <td>s.decker@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Michael</td>
                            <td>Bruce</td>
                            <td>Javascript Developer</td>
                            <td>Singapore</td>
                            <td>29</td>
                            <td>2011/06/27</td>
                            <td>$183,000</td>
                            <td>5384</td>
                            <td>m.bruce@datatables.net</td>
                        </tr>
                        <tr>
                            <td>Donna</td>
                            <td>Snider</td>
                            <td>Customer Support</td>
                            <td>New York</td>
                            <td>27</td>
                            <td>2011/01/25</td>
                            <td>$112,000</td>
                            <td>4226</td>
                            <td>d.snider@datatables.net</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>

            <!-- BEGIN SAMPLE TABLE PORTLET-->
            <div class="portlet box green">
                <div class="portlet-title">
                    <div class="caption">
                        <i class="fa fa-cogs"></i>订单列表</div>
                    <div class="tools">
                        <a href="javascript:;" class="collapse"> </a>
                        <a href="#portlet-config" data-toggle="modal" class="config"> </a>
                        <a href="javascript:;" class="reload"> </a>
                        <a href="javascript:;" class="remove"> </a>
                    </div>
                </div>
                <div class="portlet-body flip-scroll">
                    <table class="table table-bordered table-striped table-condensed flip-content">
                        <thead class="flip-content">
                        <tr>
                            <th width="2%">
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </th>
                            <th width="20%"> 联系方式 </th>
                            <th> 顾客姓名 </th>
                            <th class="numeric"> 电子票 </th>
                            <th class="numeric"> 购买产品（产品ID） </th>
                            <th class="numeric"> 供应商 </th>
                            <th class="numeric"> 购买日期 </th>
                            <th class="numeric"> 消费日期 </th>
                            <th class="numeric"> 使用状态 </th>
                            <th class="numeric"> 是否有效 </th>
                            <th class="numeric"> 验票人 </th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AAC </td>
                            <td> AUSTRALIAN AGRICULTURAL COMPANY LIMITED. </td>
                            <td class="numeric"> &nbsp; </td>
                            <td class="numeric"> -0.01 </td>
                            <td class="numeric"> -0.36% </td>
                            <td class="numeric"> $1.39 </td>
                            <td class="numeric"> $1.39 </td>
                            <td class="numeric"> &nbsp; </td>
                            <td class="numeric"> 9,395 </td>
                            <td class="numeric"> renqi </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AAD </td>
                            <td> ARDENT LEISURE GROUP </td>
                            <td class="numeric"> $1.15 </td>
                            <td class="numeric"> +0.02 </td>
                            <td class="numeric"> 1.32% </td>
                            <td class="numeric"> $1.14 </td>
                            <td class="numeric"> $1.15 </td>
                            <td class="numeric"> $1.13 </td>
                            <td class="numeric"> 56,431 </td>
                            <td class="numeric"> renqi </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AAX </td>
                            <td> AUSENCO LIMITED </td>
                            <td class="numeric"> $4.00 </td>
                            <td class="numeric"> -0.04 </td>
                            <td class="numeric"> -0.99% </td>
                            <td class="numeric"> $4.01 </td>
                            <td class="numeric"> $4.05 </td>
                            <td class="numeric"> $4.00 </td>
                            <td class="numeric"> 90,641 </td>
                            <td class="numeric"> renqi </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> ABC </td>
                            <td> ADELAIDE BRIGHTON LIMITED </td>
                            <td class="numeric"> $3.00 </td>
                            <td class="numeric"> +0.06 </td>
                            <td class="numeric"> 2.04% </td>
                            <td class="numeric"> $2.98 </td>
                            <td class="numeric"> $3.00 </td>
                            <td class="numeric"> $2.96 </td>
                            <td class="numeric"> 862,518 </td>
                            <td class="numeric"> renqi </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> ABP </td>
                            <td> ABACUS PROPERTY GROUP </td>
                            <td class="numeric"> $1.91 </td>
                            <td class="numeric"> 0.00 </td>
                            <td class="numeric"> 0.00% </td>
                            <td class="numeric"> $1.92 </td>
                            <td class="numeric"> $1.93 </td>
                            <td class="numeric"> $1.90 </td>
                            <td class="numeric"> 595,701 </td>
                            <td class="numeric"> renqi </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> ABY </td>
                            <td> ADITYA BIRLA MINERALS LIMITED </td>
                            <td class="numeric"> $0.77 </td>
                            <td class="numeric"> +0.02 </td>
                            <td class="numeric"> 2.00% </td>
                            <td class="numeric"> $0.76 </td>
                            <td class="numeric"> $0.77 </td>
                            <td class="numeric"> $0.76 </td>
                            <td class="numeric"> 54,567 </td>
                            <td class="numeric"> renqi </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> ACR </td>
                            <td> ACRUX LIMITED </td>
                            <td class="numeric"> $3.71 </td>
                            <td class="numeric"> +0.01 </td>
                            <td class="numeric"> 0.14% </td>
                            <td class="numeric"> $3.70 </td>
                            <td class="numeric"> $3.72 </td>
                            <td class="numeric"> $3.68 </td>
                            <td class="numeric"> 191,373 </td>
                            <td class="numeric"> renqi </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> ADU </td>
                            <td> ADAMUS RESOURCES LIMITED </td>
                            <td class="numeric"> $0.72 </td>
                            <td class="numeric"> 0.00 </td>
                            <td class="numeric"> 0.00% </td>
                            <td class="numeric"> $0.73 </td>
                            <td class="numeric"> $0.74 </td>
                            <td class="numeric"> $0.72 </td>
                            <td class="numeric"> 8,602,291 </td>
                            <td class="numeric"> renqi </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AGG </td>
                            <td> ANGLOGOLD ASHANTI LIMITED </td>
                            <td class="numeric"> $7.81 </td>
                            <td class="numeric"> -0.22 </td>
                            <td class="numeric"> -2.74% </td>
                            <td class="numeric"> $7.82 </td>
                            <td class="numeric"> $7.82 </td>
                            <td class="numeric"> $7.81 </td>
                            <td class="numeric"> 148 </td>
                            <td class="numeric"> renqi </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AGK </td>
                            <td> AGL ENERGY LIMITED </td>
                            <td class="numeric"> $13.82 </td>
                            <td class="numeric"> +0.02 </td>
                            <td class="numeric"> 0.14% </td>
                            <td class="numeric"> $13.83 </td>
                            <td class="numeric"> $13.83 </td>
                            <td class="numeric"> $13.67 </td>
                            <td class="numeric"> 846,403 </td>
                            <td class="numeric"> renqi </td>
                        </tr>
                        <tr>
                            <td>
                                <label class="mt-checkbox mt-checkbox-single mt-checkbox-outline">
                                    <input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" />
                                    <span></span>
                                </label>
                            </td>
                            <td> AGO </td>
                            <td> ATLAS IRON LIMITED </td>
                            <td class="numeric"> $3.17 </td>
                            <td class="numeric"> -0.02 </td>
                            <td class="numeric"> -0.47% </td>
                            <td class="numeric"> $3.11 </td>
                            <td class="numeric"> $3.22 </td>
                            <td class="numeric"> $3.10 </td>
                            <td class="numeric"> 5,416,303 </td>
                            <td class="numeric"> renqi </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>

        </div>
    </div>
    <!-- END PAGE BASE CONTENT -->
</div>
</body>
</html>
