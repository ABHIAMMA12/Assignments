import "./style.css";
const Left_Component = () => {
  return (
    <>
      <aside>
        <div class="top">
          <div class="logo">
            <h2>
              <i class="danger">BABAR</i>{" "}
            </h2>
          </div>
          <div class="close" id="close_btn">
            <i class="material-symbols-sharp">close</i>
          </div>
        </div>
        {/* <!-- end top --> */}
        <div class="sidebar">
          <a href="#">
            <i class="material-symbols-sharp">grid_view </i>
            <h3>Dashbord</h3>
          </a>
          <a href="#" class="active">
            <i class="material-symbols-sharp">person_outline </i>
            <h3>custumers</h3>
          </a>
          <a href="#">
            <i class="material-symbols-sharp">insights </i>
            <h3>Analytics</h3>
          </a>
          <a href="#">
            <i class="material-symbols-sharp">mail_outline </i>
            <h3>Messages</h3>
            <span class="msg_count">14</span>
          </a>
          <a href="#">
            <i class="material-symbols-sharp">receipt_long </i>
            <h3>Products</h3>
          </a>
          <a href="#">
            <i class="material-symbols-sharp">report_gmailerrorred </i>
            <h3>Reports</h3>{" "}
          </a>
          <a href="#">
            <i class="material-symbols-sharp">settings </i>
            <h3>settings</h3>
          </a>
          <a href="#">
            <i class="material-symbols-sharp">add </i>
            <h3>Add Product</h3>
          </a>
          <a href="#">
            <i class="material-symbols-sharp">logout </i>
            <h3>logout</h3>
          </a>
        </div>
      </aside>
    </>
  );
};

export default Left_Component;
